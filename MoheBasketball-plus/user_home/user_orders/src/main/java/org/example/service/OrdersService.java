package org.example.service;

import org.example.pojo.OrdersPo;

import java.util.List;

public interface OrdersService {
    String findAllOrdersList();

    void deleteOrders(Integer id);
}
