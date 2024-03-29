package nl.stil4m.mollie.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties({"resource"})
public class Method {
	private final String id;
	
	private final String description;
	
	private final MethodAmount amount;
	
	private final MethodImage image;
	
	@JsonCreator
	public Method(@JsonProperty("id") String id, @JsonProperty("description") String description, @JsonProperty("amount") MethodAmount amount, @JsonProperty("image") MethodImage image) {
		this.id = id;
		this.description = description;
		this.amount = amount;
		this.image = image;
	}
	
	public String getId() { return this.id; }
	
	public String getDescription() { return this.description; }
	
	public MethodAmount getAmount() { return this.amount; }
	
	public MethodImage getImage() { return this.image; }
}
