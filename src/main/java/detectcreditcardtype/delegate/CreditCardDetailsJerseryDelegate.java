package main.java.detectcreditcardtype.delegate;

import java.util.logging.Logger;

import javax.ws.rs.core.Response;

import main.java.detectcreditcardtype.Exception.CreditCardException;
import main.java.detectcreditcardtype.pojos.GetCreditCardDetailsRequest;
import main.java.detectcreditcardtype.pojos.GetCreditCardDetailsResponse;
import main.java.detectcreditcardtype.processor.CreditCardDetailsJerseryProcessor;
import main.java.detectcreditcardtype.utils.CreditCardUtils;

public class CreditCardDetailsJerseryDelegate {

	public Response perFormPayment(GetCreditCardDetailsRequest request) {
		GetCreditCardDetailsResponse response = null;
		try {

			CreditCardUtils.checkParam(request);
			response = CreditCardDetailsJerseryProcessor.fetchCreditCardDetails(request);

		} catch (CreditCardException e) {
			response = new GetCreditCardDetailsResponse();
			// logger.error("Exception Occured while processing the request");
			response.setError(e.getMessage());
		}
		return generateSuccessFullResponse(response);
	}

	private Response generateSuccessFullResponse(Object entity) {
		return Response.ok(entity).build();
	}

}
