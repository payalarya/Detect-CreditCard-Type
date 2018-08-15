package main.java.detectcreditcardtype.service;

import java.util.logging.Logger;

import main.java.detectcreditcardtype.exception.CreditCardException;
import main.java.detectcreditcardtype.pojos.GetCreditCardDetailsRequest;
import main.java.detectcreditcardtype.pojos.GetCreditCardDetailsResponse;
import main.java.detectcreditcardtype.spi.FetchCreditCardDetails;

public class CreditCardDetailsServiceImpl implements CreditCardDetailsService {
	private final static Logger logger = Logger.getLogger(CreditCardDetailsServiceImpl.class.getName());

	private static CreditCardDetailsService instance = new CreditCardDetailsServiceImpl();

	// make singleton
	private CreditCardDetailsServiceImpl() {

	}

	/*
	 * Gets the single instance of CreditCardDetailsServiceImpl
	 * 
	 * @return single instance of CreditCardDetailsServiceImpl
	 */
	public static CreditCardDetailsService getInstance() {

		return instance;
	}

	public GetCreditCardDetailsResponse fetchCreditCardDetails(GetCreditCardDetailsRequest request)
			throws CreditCardException {
		logger.info("Calling the spi layer ;");
		return FetchCreditCardDetails.newInstance().invoke(request);
	}

}
