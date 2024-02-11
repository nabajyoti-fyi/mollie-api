package nl.stil4m.mollie.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class Customer {
	private final String resource;
	
	private final String id;
	
	private final String mode;
	
	private final String name;
	
	private final String email;
	
	private final Optional<String> locale;
	
	private final Map<String, Object> metadata;
	
	private final List<String> recentlyUsedMethods;
	
	private final Date createdDatetime;
	
	public Customer(@JsonProperty("resource") String resource, @JsonProperty("id") String id, @JsonProperty("mode") String mode, @JsonProperty("name") String name, @JsonProperty("email") String email, @JsonProperty("locale") Optional<String> locale, @JsonProperty("metaData") Map<String, Object> metadata, @JsonProperty("recentlyUsedMethods") List<String> recentlyUsedMethods, @JsonProperty("createdDatetime") Date createdDatetime) {
		this.resource = resource;
		this.id = id;
		this.mode = mode;
		this.name = name;
		this.email = email;
		this.locale = locale;
		this.metadata = metadata;
		this.recentlyUsedMethods = recentlyUsedMethods;
		this.createdDatetime = createdDatetime;
	}
	
	public String getResource() { return this.resource; }
	
	public String getId() { return this.id; }
	
	public String getMode() { return this.mode; }
	
	public String getName() { return this.name; }
	
	public String getEmail() { return this.email; }
	
	public Optional<String> getLocale() { return this.locale; }
	
	public Map<String, Object> getMetadata() { return this.metadata; }
	
	public List<String> getRecentlyUsedMethods() { return this.recentlyUsedMethods; }
	
	public Date getCreatedDatetime() { return this.createdDatetime; }
}
