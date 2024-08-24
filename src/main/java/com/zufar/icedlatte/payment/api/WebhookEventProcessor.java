package com.zufar.icedlatte.payment.api;

import com.stripe.model.Event;
import com.stripe.model.checkout.Session;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * This class is responsible for processing stripe payment event to transfer it to the responsibility area
 * of class that is engaged in catching event types.
 * */
@Slf4j
@RequiredArgsConstructor
@Service
public class WebhookEventProcessor {

    private final WebhookEventProvider webhookEventProvider;
    private final WebhookEventParser webhookEventParser;
    private final WebhookEventHandler webhookEventHandler;

    public void processPaymentEvent(String paymentPayload, String stripeSignatureHeader) {
        log.info("Process Stripe payment event: start Stripe payment event processing");
        Event stripePaymentEvent = webhookEventProvider.createPaymentEvent(paymentPayload, stripeSignatureHeader);
        Session stripeSession = webhookEventParser.parseEventToSession(stripePaymentEvent);
        webhookEventHandler.handlePaymentEvent(stripePaymentEvent, stripeSession);
        log.info("Process Stripe payment event: Stripe event successfully processed");
    }

}
