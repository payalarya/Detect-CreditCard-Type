package main.java.detectcreditcardtype.processor;

import java.util.logging.Logger;

import main.java.detectcreditcardtype.exception.CreditCardException;
import main.java.detectcreditcardtype.pojos.GetCreditCardDetailsRequest;
import main.java.detectcreditcardtype.pojos.GetCreditCardDetailsResponse;
import main.java.detectcreditcardtype.service.CreditCardDetailsService;
import main.java.detectcreditcardtype.service.CreditCardDetailsServiceImpl;

public class CreditCardDetailsJerseryProcessor {
	private final static Logger logger = Logger.getLogger(CreditCardDetailsJerseryProcessor.class.getName());

	public static GetCreditCardDetailsResponse fetchCreditCardDetails(GetCreditCardDetailsRequest request)
			throws CreditCardException {
		GetCreditCardDetailsResponse response = null;
		logger.info("Call the service" );
		CreditCardDetailsService creditCardService = CreditCardDetailsServiceImpl.getInstance();
		response = creditCardService.fetchCreditCardDetails(request);
		return response;
	}

}
