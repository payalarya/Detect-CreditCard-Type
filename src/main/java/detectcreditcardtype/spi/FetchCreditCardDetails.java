package main.java.detectcreditcardtype.spi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

import main.java.detectcreditcardtype.pojos.GetCreditCardDetailsRequest;
import main.java.detectcreditcardtype.pojos.GetCreditCardDetailsResponse;

public class FetchCreditCardDetails {
  private final static Logger logger = Logger.getLogger(FetchCreditCardDetails.class.getName());
  
  public static FetchCreditCardDetails newInstance() {
	  return new FetchCreditCardDetails();	  
  }


	
	public GetCreditCardDetailsResponse invoke(GetCreditCardDetailsRequest request) {
		GetCreditCardDetailsResponse response = new GetCreditCardDetailsResponse();
		logger.info("Processing the request :");
		//Either we can check for the strict match or for normal.
		CreditCardType[] creditCardType = FetchCreditCardDetails.forCardNumber(request.getCardNumber());
		
		logger.info("Matching cards : " +  Arrays.deepToString(creditCardType));
		
		if(creditCardType !=null) response.setValidCard(creditCardType.length == 0 ? false : true);
		response.setCreditCardType(creditCardType);
		
		return response;
	}
	
	/**
	 * Returns the card type matching this account, or {@link CreditCardType} for no
	 * match.
	 * <p/>
	 * A partial account type may be given, with the caveat that it may not have
	 * enough digits to match.
	 */
	public static CreditCardType[] forCardNumber(String cardNumber) {
		return forCardNumber(cardNumber, false);
	}

	public static CreditCardType[] forCardNumber(String cardNumber, boolean strict) {
		List<CreditCardType> matchedCardTypes = new ArrayList<CreditCardType>();
		for (CreditCardType creditCardType : CreditCardType.values()) {
			if (strict && creditCardType.validate(cardNumber)) {
				matchedCardTypes.add(creditCardType);
			} else if (creditCardType.validatePattern(cardNumber)) {
				matchedCardTypes.add(creditCardType);
			}
		}
		// Remove UNKNOWN if anything else is matched
		if (matchedCardTypes.size() > 1) {
			matchedCardTypes.remove(CreditCardType.UNKNOWN);
		}
		return matchedCardTypes.toArray(new CreditCardType[matchedCardTypes.size()]);
	}

	/**
	 * Returns the card type matching this account, or {@link CreditCardType} for no
	 * match.
	 * <p/>
	 * A partial account type may be given, with the caveat that it may not have
	 * enough digits to match.
	 */
	public static CreditCardType forCardNumberStrict(String cardNumber) {
		CreditCardType[] creditCardTypes = forCardNumber(cardNumber, true);
		if (creditCardTypes.length > 0) {
			return creditCardTypes[0];
		}
		return null;
	}


}
