package org.example.service.impl;

import org.example.client.ProductClient;
import org.example.domin.Order;
import org.example.mapper.OrderMapper;
import org.example.model.ProductDto;
import org.example.pojo.OrderPo;
import org.example.service.OrderService;
import org.example.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderMapper orderMapper;

    @Autowired
    ProductClient productClient;
    @Override
    public List<OrderPo> findAllList() {
        return orderMapper.selectList(null);
    }

    @Override
    public Order loadOrder(int id) {
        OrderPo orderPo = orderMapper.selectById(id);
        ProductDto byIdProduct = productClient.findByIdProduct(orderPo.getProductId());

        return new Order().setId(orderPo.getId()).setAmount(orderPo.getOrderAmount()).setProductDto(byIdProduct);
    }
}
