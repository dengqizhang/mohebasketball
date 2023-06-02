package org.example.controller;

import org.example.pojo.OrdersPo;
import org.example.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/user/orders")
public class OrdersController {
    @Autowired private OrdersService ordersService;
    //查询全部订单
    @GetMapping("/ordersapi")
    public String findAllOrders(){
        return ordersService.findAllOrdersList();
    }
    //根据id删除订单
    @PostMapping("/orderapi/{id}")
    public void deleteOrders(@PathVariable Integer id){
        ordersService.deleteOrders(id);
    }

}
