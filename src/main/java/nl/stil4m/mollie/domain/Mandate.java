package nl.stil4m.mollie.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import java.util.Map;
import java.util.Optional;

public class Mandate {
	private final String resource;
	
	private final String id;
	
	private final String status;
	
	private final String method;
	
	private final String customerId;
	
	private final Map<String, Object> details;
	
	private final Optional<String> mandateReference;
	
	private final Date createdDatetime;
	
	private final Date signatureDate;
	
	private final Links links;
	
	public Mandate(@JsonProperty("resource") String resource, @JsonProperty("id") String id, @JsonProperty("status") String status, @JsonProperty("method") String method, @JsonProperty("customerId") String customerId, @JsonProperty("details") Map<String, Object> details, @JsonProperty("mandateReference") Optional<String> mandateReference, @JsonProperty("createdDatetime") Date createdDatetime, @JsonProperty("signatureDate") Date signatureDate, @JsonProperty("links") Links links) {
		this.resource = resource;
		this.id = id;
		this.status = status;
		this.method = method;
		this.customerId = customerId;
		this.details = details;
		this.mandateReference = mandateReference;
		this.createdDatetime = createdDatetime;
		this.signatureDate = signatureDate;
		this.links = links;
	}
	
	public String getResource() { return this.resource; }
	
	public String getId() { return this.id; }
	
	public String getStatus() { return this.status; }
	
	public String getMethod() { return this.method; }
	
	public String getCustomerId() { return this.customerId; }
	
	public Map<String, Object> getDetails() { return this.details; }
	
	public Optional<String> getMandateReference() { return this.mandateReference; }
	
	public Date getCreatedDatetime() { return this.createdDatetime; }
	
	public Date getSignatureDate() { return this.signatureDate; }
	
	public Links getLinks() { return this.links; }
}
