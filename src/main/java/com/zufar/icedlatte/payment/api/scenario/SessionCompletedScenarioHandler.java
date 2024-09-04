package com.zufar.icedlatte.payment.api.scenario;

import com.stripe.model.checkout.Session;
import com.zufar.icedlatte.cart.repository.ShoppingCartRepository;
import com.zufar.icedlatte.email.sender.PaymentEmailConfirmation;
import com.zufar.icedlatte.openapi.dto.OrderDto;
import com.zufar.icedlatte.order.api.OrderCreator;
import com.zufar.icedlatte.payment.enums.StripeSessionConstants;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Slf4j
@RequiredArgsConstructor
@Service(StripeSessionConstants.SESSION_IS_COMPLETED)
public class SessionCompletedScenarioHandler implements SessionScenarioHandler {

    private final PaymentEmailConfirmation paymentEmailConfirmation;
    private final OrderCreator orderCreator;
    private final ShoppingCartRepository shoppingCartRepository;

    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED)
    public void handle(Session stripeSession) {
        log.info("Checkout stripe session with id = '{}' completed.", stripeSession.getId());

        UUID userId = UUID.fromString(stripeSession.getMetadata().get("userId"));

        log.info("Creating new order for user with id = '{}'", userId);
        OrderDto order = orderCreator.createOrder(userId);
        log.info("New order with id = '{}' was created and saved to database for user with id = '{}'", order.getId(), userId);

        shoppingCartRepository.deleteByUserId(userId);
        log.info("Deleted the shopping cart for user with id = '{}'", userId);

        paymentEmailConfirmation.send(stripeSession);
        log.info("Confirmation email was sent to user with id = '{}'.", userId);
    }
}
