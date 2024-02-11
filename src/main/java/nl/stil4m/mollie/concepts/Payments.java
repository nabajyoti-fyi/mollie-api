package nl.stil4m.mollie.concepts;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import nl.stil4m.mollie.RequestExecutor;
import nl.stil4m.mollie.ResponseOrError;
import nl.stil4m.mollie.domain.CreatePayment;
import nl.stil4m.mollie.domain.Page;
import nl.stil4m.mollie.domain.Payment;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpUriRequest;

public class Payments extends AbstractConcept<Payment> implements ListAll<Payment>, GetById<Payment>, Create<Payment, CreatePayment> {
	protected static final TypeReference<Page<Payment>> PAGE_TYPE = new TypeReference<Page<Payment>>() {
		
		};
	
	protected static final TypeReference<Payment> SINGLE_TYPE = new TypeReference<Payment>() {
		
		};
	
	public Payments(String apiKey, String endpoint, RequestExecutor requestExecutor) { super(apiKey, requestExecutor, SINGLE_TYPE, PAGE_TYPE, new String[] { endpoint, "payments" }); }
	
	public ResponseOrError<Payment> delete(String id) throws IOException {
		HttpDelete httpDelete = new HttpDelete(url(new String[] { id }));
		return requestSingle((HttpUriRequest)httpDelete);
	}
}
