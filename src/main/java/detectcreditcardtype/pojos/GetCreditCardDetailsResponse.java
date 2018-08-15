package main.java.detectcreditcardtype.pojos;

import main.java.detectcreditcardtype.spi.CreditCardType;

public class GetCreditCardDetailsResponse {
	
	String error;
	CreditCardType[] creditCardType;
	
	
	public CreditCardType[] getCreditCardType() {
		return creditCardType;
	}

	public void setCreditCardType(CreditCardType[] creditCardType) {
		this.creditCardType = creditCardType;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

}
