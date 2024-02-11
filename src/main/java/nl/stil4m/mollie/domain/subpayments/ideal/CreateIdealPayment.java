package nl.stil4m.mollie.domain.subpayments.ideal;

import java.util.Map;
import java.util.Optional;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import nl.stil4m.mollie.domain.subpayments.base.OptionedCreatePayment;

public class CreateIdealPayment extends OptionedCreatePayment<IdealPaymentOptions> {
	public CreateIdealPayment(@Nonnull Double amount, @Nonnull String description, @Nonnull String redirectUrl, @Nonnull Optional<String> webhookUrl, @Nullable Map<String, Object> metadata, @Nonnull IdealPaymentOptions options) { super("ideal", amount, description, redirectUrl, webhookUrl, metadata, options); }
}
