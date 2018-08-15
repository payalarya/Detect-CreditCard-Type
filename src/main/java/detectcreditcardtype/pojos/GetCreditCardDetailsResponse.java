package main.java.detectcreditcardtype.pojos;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import main.java.detectcreditcardtype.spi.CreditCardType;

@XmlRootElement
public class GetCreditCardDetailsResponse implements Serializable{
	
	private String error;
	private CreditCardType[] creditCardType;
	private boolean validCard;
	
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

	public boolean isValidCard() {
		return validCard;
	}

	public void setValidCard(boolean validCard) {
		this.validCard = validCard;
	}
	
	

}
