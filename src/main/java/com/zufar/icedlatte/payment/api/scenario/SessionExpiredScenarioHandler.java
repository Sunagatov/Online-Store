package com.zufar.icedlatte.payment.api.scenario;

import com.stripe.model.checkout.Session;
import com.zufar.icedlatte.payment.enums.StripeSessionConstants;
import com.zufar.icedlatte.payment.repository.PaymentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import static com.zufar.icedlatte.payment.enums.StripeSessionStatus.SESSION_IS_EXPIRED;


@Slf4j
@RequiredArgsConstructor
@Service(StripeSessionConstants.SESSION_IS_EXPIRED)
public class SessionExpiredScenarioHandler implements SessionScenarioHandler {

    private final PaymentRepository paymentRepository;

    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED)
    public void handle(Session stripeSession) {
        log.info("Handle payment scenario method: start of handling session: {} by failed scenario.", stripeSession.getId());
        paymentRepository.updateStatusAndDescriptionInPayment(stripeSession.getId(), SESSION_IS_EXPIRED.toString(), SESSION_IS_EXPIRED.getDescription());
        log.info("Handle payment scenario method: finish of handling session: {} by failed scenario.", stripeSession.getId());
    }
}
