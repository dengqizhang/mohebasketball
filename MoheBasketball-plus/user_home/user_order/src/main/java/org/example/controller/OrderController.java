package org.example.controller;

import org.example.client.AccountsClient;
import org.example.client.ProductClient;
import org.example.domin.Order;
import org.example.model.AccountsDto;
import org.example.pojo.OrderPo;
import org.example.service.OrderService;
import org.example.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@ResponseBody
@RestController
@CrossOrigin
public class OrderController {
    @Autowired
    OrderService orderService;
    @Autowired
    ProductClient productClient;
    @Autowired
    AccountsClient accountsClient;
    @GetMapping("/getaccounts/{id}")
    public AccountsDto findAllaccounts(@PathVariable("id") int id){
        return accountsClient.finAllaccounts(id);
    }
    @GetMapping("/order")
    public Result findAllOrder(){
        List<OrderPo> orderPos = orderService.findAllList();
        return Result.success(orderPos);
    }

    @GetMapping("/orders")
    public Result findAllOrders(){
        return productClient.findAllProduct();
    }

    @GetMapping("/orders/{id}")
    @ResponseBody
    public Order loadOrder(@PathVariable("id") int id){
        return orderService.loadOrder(id);
    }

}
