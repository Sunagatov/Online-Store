package com.zufar.icedlatte.payment.repository;

import com.zufar.icedlatte.payment.entity.Payment;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PaymentRepository extends CrudRepository<Payment, String> {

    @Modifying
    @Query(value = "UPDATE payment SET status = :status, description = :description WHERE session_id = :session_id",
            nativeQuery = true)
    void updateStatusAndDescriptionInPayment(@Param("session_id") String sessionId,
                                             @Param("status") String status,
                                             @Param("description") String description);

    Optional<Payment> findBySessionId(String id);
}
