package main.java.detectcreditcardtype.service;

import java.util.logging.Logger;

import main.java.detectcreditcardtype.Exception.CreditCardException;
import main.java.detectcreditcardtype.pojos.GetCreditCardDetailsRequest;
import main.java.detectcreditcardtype.pojos.GetCreditCardDetailsResponse;

public class CreditCardDetailsServiceImpl implements CreditCardDetailsService {
	private final static Logger logger = Logger.getLogger(CreditCardDetailsServiceImpl.class.getName());

	private static CreditCardDetailsService instance = new CreditCardDetailsServiceImpl();

	// make singleton
	private CreditCardDetailsServiceImpl() {

	}

	/*
	 * Gets the single instance of PaymentServiceImpl
	 * 
	 * @return single instance of PaymentServiceImpl
	 */
	public static CreditCardDetailsService getInstance() {

		return instance;
	}

	public GetCreditCardDetailsResponse fetchCreditCardDetails(GetCreditCardDetailsRequest request)
			throws CreditCardException {
		// TODO Auto-generated method stub
		return null;
	}

}
