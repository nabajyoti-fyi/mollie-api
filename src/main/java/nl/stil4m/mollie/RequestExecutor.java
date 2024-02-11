package nl.stil4m.mollie;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.Map;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpUriRequest;

public class RequestExecutor {
	private final HttpClient httpClient;
	
	private final ObjectMapper objectMapper;
	
	public RequestExecutor(HttpClient httpClient, ObjectMapper objectMapper) {
		this.httpClient = httpClient;
		this.objectMapper = objectMapper;
	}
	
	public <T> ResponseOrError<T> execute(String apiKey, HttpUriRequest httpRequest, TypeReference<T> type) throws IOException {
		httpRequest.addHeader("Content-Type", "application/json");
		httpRequest.addHeader("Authorization", String.format("Bearer %s", new Object[] { apiKey }));
		return (ResponseOrError<T>)this.httpClient.execute(httpRequest, response -> {
					int status = response.getStatusLine().getStatusCode();
					if (status >= 200 && status <= 300)
						return ResponseOrError.withData(status, deserialize(response, type)); 
					return ResponseOrError.withError(status, deserialize(response, new TypeReference<Map>() {
								
								}));
				});
	}
	
	private <S> S deserialize(HttpResponse response, TypeReference<S> clazz) throws IOException { return this.objectMapper.readValue(response.getEntity().getContent(), clazz); }
	
	public String serialize(Object o) throws JsonProcessingException { return this.objectMapper.writeValueAsString(o); }
}
