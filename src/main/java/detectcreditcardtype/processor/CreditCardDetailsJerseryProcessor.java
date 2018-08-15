package main.java.detectcreditcardtype.processor;

import main.java.detectcreditcardtype.Exception.CreditCardException;
import main.java.detectcreditcardtype.pojos.GetCreditCardDetailsRequest;
import main.java.detectcreditcardtype.pojos.GetCreditCardDetailsResponse;
import main.java.detectcreditcardtype.service.CreditCardDetailsService;
import main.java.detectcreditcardtype.service.CreditCardDetailsServiceImpl;

public class CreditCardDetailsJerseryProcessor {

	public static GetCreditCardDetailsResponse fetchCreditCardDetails(GetCreditCardDetailsRequest request)
			throws CreditCardException {
		GetCreditCardDetailsResponse response = null;
		CreditCardDetailsService creditCardService = CreditCardDetailsServiceImpl.getInstance();
		response = creditCardService.fetchCreditCardDetails(request);
		return response;
	}

}
