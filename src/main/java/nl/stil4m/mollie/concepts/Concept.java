package nl.stil4m.mollie.concepts;

import com.fasterxml.jackson.core.JsonProcessingException;
import java.io.IOException;
import java.nio.charset.UnsupportedCharsetException;
import nl.stil4m.mollie.ResponseOrError;
import nl.stil4m.mollie.domain.Page;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.HttpUriRequest;

public interface Concept<T> {
	String url(String... paramVarArgs);
	
	ResponseOrError<Page<T>> requestPage(HttpUriRequest paramHttpUriRequest) throws IOException;
	
	ResponseOrError<T> requestSingle(HttpUriRequest paramHttpUriRequest) throws IOException;
	
	ResponseOrError<Void> requestVoid(HttpUriRequest paramHttpUriRequest) throws IOException;
	
	HttpEntity buildHttpEntity(Object paramObject) throws UnsupportedCharsetException, JsonProcessingException;
}
