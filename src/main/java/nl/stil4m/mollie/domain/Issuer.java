package nl.stil4m.mollie.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties({"image"})
public class Issuer {
	private final String resource;
	
	private final String id;
	
	private final String name;
	
	private final String method;
	
	@JsonCreator
	public Issuer(@JsonProperty("resource") String resource, @JsonProperty("id") String id, @JsonProperty("name") String name, @JsonProperty("method") String method) {
		this.resource = resource;
		this.id = id;
		this.name = name;
		this.method = method;
	}
	
	public String getResource() { return this.resource; }
	
	public String getId() { return this.id; }
	
	public String getName() { return this.name; }
	
	public String getMethod() { return this.method; }
}
