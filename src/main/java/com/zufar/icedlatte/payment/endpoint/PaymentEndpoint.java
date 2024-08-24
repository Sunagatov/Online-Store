package com.zufar.icedlatte.payment.endpoint;

import com.zufar.icedlatte.openapi.dto.SessionWithClientSecretDto;
import com.zufar.icedlatte.payment.api.PaymentProcessor;
import com.zufar.icedlatte.payment.api.StripeSessionProvider;
import com.zufar.icedlatte.payment.api.WebhookEventProcessor;
import com.zufar.icedlatte.payment.dto.PaymentSessionStatus;
import com.zufar.icedlatte.payment.exception.StripeSessionRetrievalException;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping(PaymentEndpoint.PAYMENT_URL)
public class PaymentEndpoint implements com.zufar.icedlatte.openapi.payment.api.PaymentApi {

    public static final String PAYMENT_URL = "/api/v1/payment";

    private final PaymentProcessor paymentProcessor;
    private final WebhookEventProcessor webhookEventProcessor;
    private final StripeSessionProvider stripeSessionProvider;

    @GetMapping
    public ResponseEntity<SessionWithClientSecretDto> processPayment(final HttpServletRequest request) {
        log.info("Received request to process payment");
        var processPaymentResponse = paymentProcessor.processPayment(request);
        log.info("Payment session was created successfully");
        return ResponseEntity.ok()
                .body(processPaymentResponse);
    }

    @PostMapping("/stripe/webhook")
    public ResponseEntity<Void> processStripeWebhook(@RequestHeader("Stripe-Signature") final String stripeSignatureHeader,
                                                     @RequestBody final String paymentPayload){
        log.info("Received Stripe payment webhook");
        webhookEventProcessor.processPaymentEvent(paymentPayload, stripeSignatureHeader);
        log.info("Finished processing Stripe payment webhook");
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/status")
    public ResponseEntity<PaymentSessionStatus> getPaymentStatus(@RequestParam final String sessionID) throws StripeSessionRetrievalException {
        log.info("Received request to get payment status, session id {}", sessionID);
        var sessionStatus = stripeSessionProvider.get(sessionID);
        log.info("Finished processing payment status retrieval");
        return ResponseEntity.ok().body(sessionStatus);
    }
}