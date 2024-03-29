package nl.stil4m.mollie;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import java.util.Optional;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

public class DynamicClientBuilder {
	private Optional<HttpClient> client = Optional.empty();
	
	private Optional<String> endpoint = Optional.empty();
	
	private Optional<ObjectMapper> objectMapper = Optional.empty();
	
	public DynamicClientBuilder withEndpoint(String endpoint) {
		this.endpoint = Optional.ofNullable(endpoint);
		return this;
	}
	
	public DynamicClientBuilder withClient(HttpClient client) {
		this.client = Optional.ofNullable(client);
		return this;
	}
	
	public DynamicClientBuilder withMapper(ObjectMapper objectMapper) {
		this.objectMapper = Optional.ofNullable(objectMapper);
		return this;
	}
	
	public DynamicClient build() {
		HttpClient client = this.client.orElseGet(HttpClientBuilder.create()::build);
		String endpoint = this.endpoint.orElse("https://api.mollie.com/v1");
		ObjectMapper objectMapper = this.objectMapper.orElseGet(() -> {
					ObjectMapper defaultObjectMapper = new ObjectMapper();
					defaultObjectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
					defaultObjectMapper.registerModule((Module)new Jdk8Module());
					return defaultObjectMapper;
				});
		return new DynamicClient(endpoint, new RequestExecutor(client, objectMapper));
	}
}
