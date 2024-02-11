package nl.stil4m.mollie;

import nl.stil4m.mollie.concepts.CustomerMandates;
import nl.stil4m.mollie.concepts.CustomerPayments;
import nl.stil4m.mollie.concepts.Customers;
import nl.stil4m.mollie.concepts.Issuers;
import nl.stil4m.mollie.concepts.Methods;
import nl.stil4m.mollie.concepts.PaymentRefunds;
import nl.stil4m.mollie.concepts.Payments;
import nl.stil4m.mollie.concepts.Refunds;
import nl.stil4m.mollie.concepts.Status;

public class Client {
	private final DynamicClient dynamicClient;
	
	private final String apiKey;
	
	public Client(DynamicClient dynamicClient, String apiKey) {
		this.dynamicClient = dynamicClient;
		this.apiKey = apiKey;
	}
	
	public Payments payments() { return this.dynamicClient.payments(this.apiKey); }
	
	public Status status() { return this.dynamicClient.status(this.apiKey); }
	
	public Methods methods() { return this.dynamicClient.methods(this.apiKey); }
	
	public Issuers issuers() { return this.dynamicClient.issuers(this.apiKey); }
	
	public Refunds refunds() { return this.dynamicClient.refunds(this.apiKey); }
	
	public PaymentRefunds paymentRefunds(String paymentId) { return this.dynamicClient.paymentRefunds(this.apiKey, paymentId); }
	
	public Customers customers() { return this.dynamicClient.customers(this.apiKey); }
	
	public CustomerPayments customerPayments(String customerId) { return this.dynamicClient.customerPayments(this.apiKey, customerId); }
	
	public CustomerMandates customerMandates(String customerId) { return this.dynamicClient.customerMandates(this.apiKey, customerId); }
}
