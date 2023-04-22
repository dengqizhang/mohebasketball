package org.example.service;

import org.example.domin.Order;
import org.example.pojo.OrderPo;

import java.util.List;

public interface OrderService {
    List<OrderPo> findAllList();

    Order loadOrder(int id);
}
