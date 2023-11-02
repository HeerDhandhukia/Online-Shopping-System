package com.microservice.orderservice.service;

import com.microservice.orderservice.payload.request.OrderRequest;
import com.microservice.orderservice.payloadresponse.OrderResponse;

public interface OrderService {
    long placeOrder(OrderRequest orderRequest);

    OrderResponse getOrderDetails(long orderId);
}
