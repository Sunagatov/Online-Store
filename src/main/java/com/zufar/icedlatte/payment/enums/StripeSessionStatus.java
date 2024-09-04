package com.zufar.icedlatte.payment.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * Stripe Webhook sends <a href="https://docs.stripe.com/api/events/types">various events</a>.
 * So far, we're interested only in "checkout.session.expired" and "checkout.session.completed".
 */
@Getter
@RequiredArgsConstructor
public enum StripeSessionStatus {
    /**
     * Indicates that the checkout session has expired.
     */
    SESSION_IS_EXPIRED(StripeSessionConstants.SESSION_IS_EXPIRED, "Checkout Session has expired."),

    /**
     * Indicates that the payment has succeeded.
     */
    SESSION_IS_COMPLETED(StripeSessionConstants.SESSION_IS_COMPLETED, "Payment has succeeded.");

    private final String status;
    private final String description;
}
