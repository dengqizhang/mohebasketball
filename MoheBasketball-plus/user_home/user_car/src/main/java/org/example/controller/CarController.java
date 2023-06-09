package org.example.controller;

import org.example.client.ProductClient;
import org.example.domin.Car;
import org.example.model.ProductDto;
import org.example.pojo.CarPo;
import org.example.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user/car")
public class CarController {
    @Autowired private CarService carService;
    @Autowired private ProductClient productClient;
    //查询购物车
    @GetMapping("/getcar")
    public CarPo getcar(){
        return carService.findAllcar();
    }
    //购物车里包含商品
    @GetMapping("/getcar_products")
    public Car getcar_products(@RequestParam("ids") List<Long> ids){
        return carService.findcar_products(ids);
    }
    //远程调用查询所有商品接口
    @GetMapping("/getProduct")
    public List<ProductDto> findAllProduct(){
        return carService.findAllProduct();
    }
    //远程调用批量查询接口
    @GetMapping("/getProducts")
    public List<ProductDto> findByIdProducts(@RequestParam("ids") List<Long> ids){
        return carService.findByIdProducts(ids);
    }
}
