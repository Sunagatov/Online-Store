package com.zufar.icedlatte.payment.exception;

import lombok.Getter;

import java.util.UUID;

@Getter
public class OrderAlreadyPaidException extends RuntimeException {

    private final UUID orderId;

    public OrderAlreadyPaidException(final UUID orderId) {
        super(String.format("Order '%s' has already been paid.", orderId));
        this.orderId = orderId;
    }
}
