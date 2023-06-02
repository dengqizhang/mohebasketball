package org.example.service;

import org.example.domin.Car;
import org.example.model.ProductDto;
import org.example.pojo.CarPo;

import java.util.List;

public interface CarService {
    //查询所有商品
    List<ProductDto> findAllProduct();
    //查询购物车
    CarPo findAllcar();
    //批量查询商品
    List<ProductDto> findByIdProducts(List<Long> ids);
    //购物车里包含商品
    Car findcar_products(List<Long> ids);

}
