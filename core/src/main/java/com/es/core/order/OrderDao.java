package com.es.core.order;

import com.es.core.model.order.Order;
import com.es.core.model.order.OrderStatus;

import java.util.List;

public interface OrderDao {
    void placeOrder(Order order);
    Order getOrderBySecureId(String secureId);
    Order getOrderById(Long id);
    List<Order> getOrders();
    void updateOrderStatus(Long id, OrderStatus status);
}
