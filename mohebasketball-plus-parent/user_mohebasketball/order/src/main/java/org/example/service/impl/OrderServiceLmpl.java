package org.example.service.impl;

import org.example.client.CommodityClient;
import org.example.domin.Order;
import org.example.mapper.OrderMapper;
import org.example.pojo.OrderPo;
import org.example.service.OrderService;
import org.mohebasketball.dto.CommodityDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceLmpl implements OrderService {
    @Autowired private OrderMapper orderMapper;
    @Autowired private CommodityClient commodityClient;
    /*
        根据购物车id查询商品
     */
    @Override
    public Order loadOrder(int id) {
        OrderPo orderPo = orderMapper.selectById(id);
        CommodityDto dto = commodityClient.findCommodityById(orderPo.getCid());
        return new Order().setId(orderPo.getId()).setAmount(orderPo.getAmount()).setCommodity(dto);
    }
    /*
        查询全部订单
     */
    @Override
    public List<Order> findAllOrder() {

        List<Order> orders = orderMapper.selectList(null);
        List<CommodityDto> allCommodity = commodityClient.findAllCommodity();
//        List<CommodityDto> dtos = commodityClient.findAllCommodity();

        return new xxx;
    }
}
