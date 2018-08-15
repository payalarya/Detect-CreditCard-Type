package main.java.detectcreditcardtype.pojos;

import main.java.detectcreditcardtype.spi.CreditCardType;

public class GetCreditCardDetailsRequest {

	String cardNumber;
	
	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	
}
