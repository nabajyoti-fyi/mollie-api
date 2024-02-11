package nl.stil4m.mollie.concepts;

import java.io.IOException;
import nl.stil4m.mollie.ResponseOrError;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;

public interface Update<R, O> extends Concept<R> {
	default ResponseOrError<R> update(String id, O update) throws IOException {
		HttpPost httpPost = new HttpPost(url(new String[] { id }));
		httpPost.setEntity(buildHttpEntity(update));
		return requestSingle((HttpUriRequest)httpPost);
	}
}
