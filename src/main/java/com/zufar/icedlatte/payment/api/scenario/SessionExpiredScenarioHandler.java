package com.zufar.icedlatte.payment.api.scenario;

import com.stripe.model.checkout.Session;
import com.zufar.icedlatte.payment.enums.StripeSessionConstants;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import static com.zufar.icedlatte.payment.enums.StripeSessionStatus.SESSION_IS_EXPIRED;

@Slf4j
@RequiredArgsConstructor
@Service(StripeSessionConstants.SESSION_IS_EXPIRED)
public class SessionExpiredScenarioHandler implements SessionScenarioHandler {

    public void handle(Session stripeSession) {
        log.info("{}, id = '{}'.", SESSION_IS_EXPIRED, stripeSession.getId());
    }
}
