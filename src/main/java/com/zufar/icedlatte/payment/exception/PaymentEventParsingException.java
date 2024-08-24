package com.zufar.icedlatte.payment.exception;

import lombok.Getter;

@Getter
public class PaymentEventParsingException extends RuntimeException {

    private final String eventType;

    public PaymentEventParsingException(final String paymentEventType) {
        super(String.format("PaymentEvent = '%s' cannot be parsed.", paymentEventType));
        this.eventType = paymentEventType;
    }
}
