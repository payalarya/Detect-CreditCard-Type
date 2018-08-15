package main.java.detectcreditcardtype.pojos;

import main.java.detectcreditcardtype.spi.CreditCardType;

public class GetCreditCardDetailsRequest {

	String cardNumber;
	CreditCardType creditCardType;
	
	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public CreditCardType getCreditCardType() {
		return creditCardType;
	}

	public void setCreditCardType(CreditCardType creditCardType) {
		this.creditCardType = creditCardType;
	}
	
	
}
