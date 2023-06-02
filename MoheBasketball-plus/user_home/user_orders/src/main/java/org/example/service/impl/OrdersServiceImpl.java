package org.example.service.impl;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.example.mapper.OrdersMapper;
import org.example.pojo.OrdersPo;
import org.example.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersServiceImpl implements OrdersService {
    @Autowired
    OrdersMapper ordersMapper;
    //查询全部订单
    @Override
    public String findAllOrdersList() {
        List<OrdersPo> ordersPos = ordersMapper.selectList(null);
        String stringobj = JSON.toJSONString(ordersPos);
        return stringobj;
    }
    //根据id删除订单
    @Override
    public void deleteOrders(Integer id) {
        ordersMapper.deleteById(id);
    }
}
