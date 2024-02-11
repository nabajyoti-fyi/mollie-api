package nl.stil4m.mollie.concepts;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Optional;
import nl.stil4m.mollie.ResponseOrError;
import nl.stil4m.mollie.domain.Page;
import nl.stil4m.mollie.domain.Payment;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.utils.URIBuilder;

public interface ListAll<T> extends Concept<T> {
	default ResponseOrError<Page<T>> all(Optional<Integer> count, Optional<Integer> offset) throws IOException, URISyntaxException { return list(count, offset); }
	
	default ResponseOrError<Page<T>> list(Optional<Integer> count, Optional<Integer> offset) throws IOException, URISyntaxException {
		URIBuilder builder = (new URIBuilder(url(new String[0]))).setParameter("count", String.valueOf(count.orElse(Integer.valueOf(10)))).setParameter("offset", String.valueOf(offset.orElse(Integer.valueOf(0))));
		HttpGet httpGet = new HttpGet(builder.build());
		return requestPage((HttpUriRequest)httpGet);
	}
	
	default ResponseOrError<Page<T>> next(Page<Payment> page) throws IOException {
		if (!page.getLinks().getNext().isPresent())
			throw new IllegalArgumentException("Page does not have next"); 
		HttpGet httpGet = new HttpGet(page.getLinks().getNext().get());
		return requestPage((HttpUriRequest)httpGet);
	}
	
	default ResponseOrError<Page<T>> previous(Page<Payment> page) throws IOException {
		if (!page.getLinks().getPrevious().isPresent())
			throw new IllegalArgumentException("Page does not have next"); 
		HttpGet httpGet = new HttpGet(page.getLinks().getPrevious().get());
		return requestPage((HttpUriRequest)httpGet);
	}
}
