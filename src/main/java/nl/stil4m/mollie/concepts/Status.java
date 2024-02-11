package nl.stil4m.mollie.concepts;

import java.io.IOException;
import nl.stil4m.mollie.domain.ApiKeyCheck;

public class Status {
	private Payments payments;
	
	public Status(Payments payments) { this.payments = payments; }
	
	public ApiKeyCheck checkApiKey() throws IOException {
		int status = this.payments.get("unknown").getStatus();
		return new ApiKeyCheck(Boolean.valueOf((status == 404)));
	}
}
