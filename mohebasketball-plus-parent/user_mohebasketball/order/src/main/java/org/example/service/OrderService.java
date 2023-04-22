package org.example.service;

import org.example.domin.Order;
import org.example.pojo.OrderPo;

import java.util.List;

public interface OrderService {
    //查询一个订单
    Order loadOrder(int id);
    //查询全部订单
    List<Order> findAllOrder();
}
