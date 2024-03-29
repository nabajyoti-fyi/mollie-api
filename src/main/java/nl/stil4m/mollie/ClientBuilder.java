package nl.stil4m.mollie;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.client.HttpClient;

public class ClientBuilder {
	private DynamicClientBuilder dynamicClientBuilder = new DynamicClientBuilder();
	
	private String apiKey;
	
	public ClientBuilder withEndpoint(String endpoint) {
		this.dynamicClientBuilder.withEndpoint(endpoint);
		return this;
	}
	
	public ClientBuilder withClient(HttpClient client) {
		this.dynamicClientBuilder.withClient(client);
		return this;
	}
	
	public ClientBuilder withMapper(ObjectMapper objectMapper) {
		this.dynamicClientBuilder.withMapper(objectMapper);
		return this;
	}
	
	public ClientBuilder withApiKey(String apiKey) {
		this.apiKey = apiKey;
		return this;
	}
	
	public Client build() {
		if (this.apiKey == null)
			throw new IllegalArgumentException("Api key may not be undefined"); 
		return new Client(this.dynamicClientBuilder.build(), this.apiKey);
	}
}
