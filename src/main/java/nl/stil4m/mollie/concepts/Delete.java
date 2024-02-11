package nl.stil4m.mollie.concepts;

import java.io.IOException;
import nl.stil4m.mollie.ResponseOrError;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpUriRequest;

public interface Delete<T> extends Concept<T> {
	default ResponseOrError<Void> delete(String id) throws IOException {
		HttpDelete httpDelete = new HttpDelete(url(new String[] { id }));
		return requestVoid((HttpUriRequest)httpDelete);
	}
}
