package com.zufar.icedlatte.order.api;

import com.zufar.icedlatte.cart.api.ShoppingCartProvider;
import com.zufar.icedlatte.openapi.dto.OrderStatus;
import com.zufar.icedlatte.openapi.dto.ShoppingCartDto;
import com.zufar.icedlatte.order.converter.OrderDtoConverter;
import com.zufar.icedlatte.order.entity.Order;
import com.zufar.icedlatte.order.entity.OrderItem;
import com.zufar.icedlatte.user.api.SingleUserProvider;
import com.zufar.icedlatte.user.entity.UserEntity;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Slf4j
@Service
@RequiredArgsConstructor
public class OrderEntityCreator {

    private final OrderDtoConverter orderDtoConverter;
    private final ShoppingCartProvider shoppingCartProvider;
    private final SingleUserProvider singleUserProvider;

    @Transactional(propagation = Propagation.REQUIRED)
    public Order create(final UUID userId) {
        UserEntity user = singleUserProvider.getUserEntityById(userId);

        ShoppingCartDto shoppingCartDto = shoppingCartProvider.getByUserIdOrThrow(userId);

        List<OrderItem> shoppingOrderItems = shoppingCartDto.getItems().stream()
                .map(orderDtoConverter::toOrderItem)
                .toList();

        return Order.builder()
                .userId(userId)
                .status(OrderStatus.CREATED)
                .deliveryAddress(user.getAddress())
                .itemsQuantity(shoppingCartDto.getItemsQuantity())
                .itemsTotalPrice(shoppingCartDto.getItemsTotalPrice())
                .items(shoppingOrderItems)
                .build();
    }
}
