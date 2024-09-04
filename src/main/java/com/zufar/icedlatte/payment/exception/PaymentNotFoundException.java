package com.zufar.icedlatte.payment.exception;

import lombok.Getter;

@Getter
public class PaymentNotFoundException extends RuntimeException {

    private final String paymentId;

    public PaymentNotFoundException(final String paymentId) {
        super(String.format("The payment with paymentId = '%s' is not found", paymentId));
        this.paymentId = paymentId;
    }
}
