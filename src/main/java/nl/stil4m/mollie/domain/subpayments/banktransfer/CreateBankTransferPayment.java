package nl.stil4m.mollie.domain.subpayments.banktransfer;

import java.util.Map;
import java.util.Optional;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import nl.stil4m.mollie.domain.subpayments.base.OptionedCreatePayment;

public class CreateBankTransferPayment extends OptionedCreatePayment<BankTransferOptions> {
	public CreateBankTransferPayment(@Nonnull Double amount, @Nonnull String description, @Nonnull String redirectUrl, @Nonnull Optional<String> webhookUrl, @Nullable Map<String, Object> metadata, BankTransferOptions options) { super("banktransfer", amount, description, redirectUrl, webhookUrl, metadata, options); }
}
