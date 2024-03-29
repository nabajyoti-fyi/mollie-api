package nl.stil4m.mollie.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;

public class Refund {
	private final String id;
	
	private final Payment payment;
	
	private final Double amount;
	
	private final String status;
	
	private final Date refundedDatetime;
	
	private final RefundLinks links;
	
	@JsonCreator
	public Refund(@JsonProperty("id") String id, @JsonProperty("payment") Payment payment, @JsonProperty("amount") Double amount, @JsonProperty("status") String status, @JsonProperty("refundedDatetime") Date refundedDatetime, @JsonProperty("links") RefundLinks links) {
		this.id = id;
		this.payment = payment;
		this.amount = amount;
		this.status = status;
		this.refundedDatetime = refundedDatetime;
		this.links = links;
	}
	
	public String getId() { return this.id; }
	
	public Payment getPayment() { return this.payment; }
	
	public Double getAmount() { return this.amount; }
	
	public String getStatus() { return this.status; }
	
	public Date getRefundedDatetime() { return this.refundedDatetime; }
	
	public RefundLinks getLinks() { return this.links; }
}
