package nl.stil4m.mollie.domain.subpayments.paypal;

import java.util.Map;
import java.util.Optional;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import nl.stil4m.mollie.domain.subpayments.base.OptionedCreatePayment;

public class CreatePayPalPayment extends OptionedCreatePayment<PayPalOptions> {
	public CreatePayPalPayment(@Nonnull Double amount, @Nonnull String description, @Nonnull String redirectUrl, @Nonnull Optional<String> webhookUrl, @Nullable Map<String, Object> metadata, @Nonnull PayPalOptions options) { super("paypal", amount, description, redirectUrl, webhookUrl, metadata, options); }
}
