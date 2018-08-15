package main.java.detectcreditcardtype.exception;

public class CreditCardException extends Exception {

	String errorKey;

	public CreditCardException() {
		super();
	}

	public CreditCardException(String message, String errorKey) {
		super(message);
		this.errorKey = errorKey;
	}
}
