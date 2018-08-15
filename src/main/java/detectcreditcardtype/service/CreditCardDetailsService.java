package main.java.detectcreditcardtype.service;

import main.java.detectcreditcardtype.Exception.CreditCardException;
import main.java.detectcreditcardtype.pojos.GetCreditCardDetailsRequest;
import main.java.detectcreditcardtype.pojos.GetCreditCardDetailsResponse;

public interface CreditCardDetailsService {

	public GetCreditCardDetailsResponse fetchCreditCardDetails(GetCreditCardDetailsRequest request)
			throws CreditCardException;

}
