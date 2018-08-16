package main.java.detectcreditcardtype.delegate;

import java.util.logging.Logger;

import javax.ws.rs.core.Response;

import main.java.detectcreditcardtype.exception.CreditCardException;
import main.java.detectcreditcardtype.pojos.GetCreditCardDetailsRequest;
import main.java.detectcreditcardtype.pojos.GetCreditCardDetailsResponse;
import main.java.detectcreditcardtype.processor.CreditCardDetailsJerseryProcessor;

public class CreditCardDetailsJerseryDelegate {
	private final static Logger logger = Logger.getLogger(CreditCardDetailsJerseryDelegate.class.getName());

	public Response fetchCreditCardDetails(GetCreditCardDetailsRequest request) {
		GetCreditCardDetailsResponse response = null;
		try {
			logger.info("Call processor to fetch the data");
			//Ideally we should not create static method but I'm writing only one method 
			//so I create static method instead of creating an object.
			response = CreditCardDetailsJerseryProcessor.fetchCreditCardDetails(request);
			logger.info("Sucessful response received");
		} catch (CreditCardException e) {
			response = new GetCreditCardDetailsResponse();
			response.setError(e.getMessage());
		}
		return generateSuccessFullResponse(response);
	}

	private Response generateSuccessFullResponse(Object entity) {
		return Response.ok(entity).build();
	}

}
