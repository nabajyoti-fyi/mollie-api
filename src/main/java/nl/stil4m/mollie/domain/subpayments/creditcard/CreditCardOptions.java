package nl.stil4m.mollie.domain.subpayments.creditcard;

public class CreditCardOptions {
	private final String billingAddress;
	
	private final String billingCity;
	
	private final String billingRegion;
	
	private final String billingPostal;
	
	private final String billingCountry;
	
	private final String shippingAddress;
	
	private final String shippingCity;
	
	private final String shippingRegion;
	
	private final String shippingPostal;
	
	private final String shippingCountry;
	
	public CreditCardOptions(String billingAddress, String billingCity, String billingRegion, String billingPostal, String billingCountry, String shippingAddress, String shippingCity, String shippingRegion, String shippingPostal, String shippingCountry) {
		this.billingAddress = billingAddress;
		this.billingCity = billingCity;
		this.billingRegion = billingRegion;
		this.billingPostal = billingPostal;
		this.billingCountry = billingCountry;
		this.shippingAddress = shippingAddress;
		this.shippingCity = shippingCity;
		this.shippingRegion = shippingRegion;
		this.shippingPostal = shippingPostal;
		this.shippingCountry = shippingCountry;
	}
	
	public String getBillingAddress() { return this.billingAddress; }
	
	public String getBillingCity() { return this.billingCity; }
	
	public String getBillingRegion() { return this.billingRegion; }
	
	public String getBillingPostal() { return this.billingPostal; }
	
	public String getBillingCountry() { return this.billingCountry; }
	
	public String getShippingAddress() { return this.shippingAddress; }
	
	public String getShippingCity() { return this.shippingCity; }
	
	public String getShippingRegion() { return this.shippingRegion; }
	
	public String getShippingPostal() { return this.shippingPostal; }
	
	public String getShippingCountry() { return this.shippingCountry; }
}
