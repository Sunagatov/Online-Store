package com.zufar.onlinestore.reservation.api.dto.creation;

import java.util.List;
import java.util.UUID;

/**
 * @param reservationId       Bind products together in one reservation
 * @param productReservations The list of products for reservation
 */

public record CreateReservationRequest(

        UUID reservationId,

        List<ProductReservation> productReservations
) {
}
