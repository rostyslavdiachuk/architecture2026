package ua.edu.chnu.grasp.indirection;

import ua.edu.chnu.common.Console;
import ua.edu.chnu.grasp.indirection.PaymentGateway.PaymentReceipt;
import ua.edu.chnu.grasp.indirection.PaymentGateway.PaymentRequest;

/**
 * Billing now depends on one thing -- {@link PaymentGateway} -- and contains no
 * vendor branch. Units, result parsing and idempotency live in the adapter.
 */
public class TuitionBillingService {

    private final PaymentGateway gateway;

    public TuitionBillingService(PaymentGateway gateway) {
        this.gateway = gateway;
    }

    public void billTuition(String invoiceId, String payerReference, long amountUah) {
        PaymentReceipt receipt = gateway.authorize(
                new PaymentRequest(invoiceId, payerReference, amountUah));
        if (receipt.approved()) {
            Console.ok("invoice " + invoiceId + " paid (" + receipt.reference() + ")");
        } else {
            Console.fail("invoice " + invoiceId + " declined");
        }
    }
}
