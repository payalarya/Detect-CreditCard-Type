package main.java.detectcreditcardtype.resource;

import java.util.logging.Logger;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;

import main.java.detectcreditcardtype.constants.CreditCardServiceConstants;
import main.java.detectcreditcardtype.delegate.CreditCardDetailsJerseryDelegate;

@Path(CreditCardServiceConstants.CONTEXT_ROOT)
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CreditCardDetailsJerseryResource {

	private final static Logger logger = Logger.getLogger(CreditCardDetailsJerseryResource.class.getName());
	protected CreditCardDetailsJerseryDelegate CreditCardDetailsDelegate;

	public void postConstruct() {
		CreditCardDetailsDelegate = new CreditCardDetailsJerseryDelegate();
	}

	public void preDestroy() {
		logger.info("BaseJerseyResource.init : " + this.getClass().getName());
	}

	@GET
	@Path(CreditCardServiceConstants.FETCH_CREDIT_CARD_DETAILS)
	public Response payDues() {

		return Response.ok().build();
		// return paymentDelegate.payDues(request);

	}
}
