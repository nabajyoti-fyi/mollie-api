package nl.stil4m.mollie.concepts;

import java.io.IOException;
import nl.stil4m.mollie.ResponseOrError;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;

public interface Create<R, O> extends Concept<R> {
	default ResponseOrError<R> create(O create) throws IOException {
		HttpPost httpPost = new HttpPost(url(new String[0]));
		httpPost.setEntity(buildHttpEntity(create));
		return requestSingle((HttpUriRequest)httpPost);
	}
}
