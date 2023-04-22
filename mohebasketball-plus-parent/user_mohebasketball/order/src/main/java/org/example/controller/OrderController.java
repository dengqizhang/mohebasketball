package org.example.controller;
import org.aspectj.weaver.ast.Or;
import org.example.client.CommodityClient;
import org.example.config.Result;
import org.example.domin.Order;
import org.example.pojo.OrderPo;
import org.example.service.OrderService;
import org.mohebasketball.dto.CommodityDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
public class OrderController {
    @Autowired private OrderService orderService;
    /*
    查询一个订单信息
     */
    @GetMapping("/orders/{id}")
    public Order loadOrder(@PathVariable("id") int id){
        return orderService.loadOrder(id);
    }
    /*
    查询全部订单信息
     */
    @GetMapping("/orders")
    public List<Order> loadOrder(){
        return orderService.findAllOrder();
    }
}
