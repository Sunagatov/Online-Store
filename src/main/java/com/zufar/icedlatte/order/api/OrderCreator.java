package com.zufar.icedlatte.order.api;

import com.zufar.icedlatte.openapi.dto.OrderDto;
import com.zufar.icedlatte.order.converter.OrderDtoConverter;
import com.zufar.icedlatte.order.entity.Order;
import com.zufar.icedlatte.order.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Slf4j
@Service
@RequiredArgsConstructor
public class OrderCreator {

    private final OrderRepository orderRepository;
    private final OrderDtoConverter orderDtoConverter;
    private final OrderEntityCreator orderEntityCreator;

    @Transactional(propagation = Propagation.REQUIRED)
    public OrderDto createOrder(final UUID userId) {
        Order createdOrderEntity = orderEntityCreator.create(userId);
        Order savedOrderEntity = orderRepository.saveAndFlush(createdOrderEntity);
        return orderDtoConverter.toResponseDto(savedOrderEntity);
    }
}
