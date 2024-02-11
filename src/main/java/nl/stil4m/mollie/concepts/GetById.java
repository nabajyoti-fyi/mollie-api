package nl.stil4m.mollie.concepts;

import java.io.IOException;
import nl.stil4m.mollie.ResponseOrError;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;

public interface GetById<T> extends Concept<T> {
	default ResponseOrError<T> get(String id) throws IOException {
		HttpGet httpGet = new HttpGet(url(new String[] { id }));
		return requestSingle((HttpUriRequest)httpGet);
	}
}
