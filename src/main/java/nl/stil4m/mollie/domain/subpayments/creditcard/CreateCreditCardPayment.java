package nl.stil4m.mollie.domain.subpayments.creditcard;

import java.util.Map;
import java.util.Optional;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import nl.stil4m.mollie.domain.subpayments.base.OptionedCreatePayment;

public class CreateCreditCardPayment extends OptionedCreatePayment<CreditCardOptions> {
	public CreateCreditCardPayment(@Nonnull Double amount, @Nonnull String description, @Nonnull String redirectUrl, @Nonnull Optional<String> webhookUrl, @Nullable Map<String, Object> metadata, @Nonnull CreditCardOptions options) { super("creditcard", amount, description, redirectUrl, webhookUrl, metadata, options); }
}
