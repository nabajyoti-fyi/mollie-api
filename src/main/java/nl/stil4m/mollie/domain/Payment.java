package nl.stil4m.mollie.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import java.util.Map;
import java.util.Optional;

@JsonIgnoreProperties({"issuer"})
public class Payment {
	private final String resource;
	
	private final String id;
	
	private final String profileId;
	
	private final String mode;
	
	private final String customerId;
	
	private final String recurringType;
	
	private final Date createdDatetime;
	
	private final String status;
	
	private final String paidDatetime;
	
	private final String cancelledDatetime;
	
	private final String expiredDatetime;
	
	private final Double amount;
	
	private final Double amountRefunded;
	
	private final Double amountRemaining;
	
	private final String description;
	
	private final String method;
	
	private final Map<String, Object> details;
	
	private final Links links;
	
	private final Map<String, Object> metadata;
	
	private final String locale;
	
	private final String countryCode;
	
	private final String expiryPeriod;
	
	private final Optional<String> mandateId;
	
	private final Optional<Boolean> canBeCancelled;
	
	public Payment(@JsonProperty("resource") String resource, @JsonProperty("id") String id, @JsonProperty("profileId") String profileId, @JsonProperty("mode") String mode, @JsonProperty("customerId") String customerId, @JsonProperty("recurringType") String recurringType, @JsonProperty("createdDatetime") Date createdDatetime, @JsonProperty("status") String status, @JsonProperty("paidDatetime") String paidDatetime, @JsonProperty("cancelledDatetime") String cancelledDatetime, @JsonProperty("expiredDatetime") String expiredDatetime, @JsonProperty("amount") Double amount, @JsonProperty("amountRefunded") Double amountRefunded, @JsonProperty("amountRemaining") Double amountRemaining, @JsonProperty("description") String description, @JsonProperty("method") String method, @JsonProperty("details") Map<String, Object> details, @JsonProperty("links") Links links, @JsonProperty("metadata") Map<String, Object> metadata, @JsonProperty("locale") String locale, @JsonProperty("countryCode") String countryCode, @JsonProperty("expiryPeriod") String expiryPeriod, @JsonProperty("mandateId") Optional<String> mandateId, @JsonProperty("canBeCancelled") Optional<Boolean> canBeCancelled) {
		this.resource = resource;
		this.id = id;
		this.profileId = profileId;
		this.mode = mode;
		this.customerId = customerId;
		this.recurringType = recurringType;
		this.createdDatetime = createdDatetime;
		this.status = status;
		this.paidDatetime = paidDatetime;
		this.cancelledDatetime = cancelledDatetime;
		this.expiredDatetime = expiredDatetime;
		this.amount = amount;
		this.amountRefunded = amountRefunded;
		this.amountRemaining = amountRemaining;
		this.description = description;
		this.method = method;
		this.details = details;
		this.links = links;
		this.metadata = metadata;
		this.locale = locale;
		this.countryCode = countryCode;
		this.expiryPeriod = expiryPeriod;
		this.mandateId = mandateId;
		this.canBeCancelled = canBeCancelled;
	}
	
	public String getResource() { return this.resource; }
	
	public String getId() { return this.id; }
	
	public String getProfileId() { return this.profileId; }
	
	public String getMode() { return this.mode; }
	
	public String getCustomerId() { return this.customerId; }
	
	public String getRecurringType() { return this.recurringType; }
	
	public Date getCreatedDatetime() { return this.createdDatetime; }
	
	public String getStatus() { return this.status; }
	
	public String getPaidDatetime() { return this.paidDatetime; }
	
	public String getCancelledDatetime() { return this.cancelledDatetime; }
	
	public String getExpiredDatetime() { return this.expiredDatetime; }
	
	public Double getAmount() { return this.amount; }
	
	public Double getAmountRefunded() { return this.amountRefunded; }
	
	public Double getAmountRemaining() { return this.amountRemaining; }
	
	public String getDescription() { return this.description; }
	
	public String getMethod() { return this.method; }
	
	public Map<String, Object> getDetails() { return this.details; }
	
	public Links getLinks() { return this.links; }
	
	public Map<String, Object> getMetadata() { return this.metadata; }
	
	public String getLocale() { return this.locale; }
	
	public String getCountryCode() { return this.countryCode; }
	
	public String getExpiryPeriod() { return this.expiryPeriod; }
	
	public Optional<String> getMandateId() { return this.mandateId; }
	
	public Optional<Boolean> geCanBeCancelled() { return this.canBeCancelled; }
}
