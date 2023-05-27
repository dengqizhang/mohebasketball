package org.example.service.impl;

import org.example.client.ProductClient;
import org.example.domin.Car;
import org.example.mapper.CarMapper;
import org.example.model.ProductDto;
import org.example.pojo.CarPo;
import org.example.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    @Autowired private CarMapper carMapper;
    @Autowired private ProductClient productClient;
    //查询所有商品
    @Override
    public List<ProductDto> findAllProduct() {
        return productClient.findAllProduct();
    }
    //查询购物车
    @Override
    public CarPo findAllcar() {
        return carMapper.selectById(0);
    }
    //批量查询商品
    @Override
    public List<ProductDto> findByIdProducts(List<Long> ids) {
        return productClient.findByIdProducts(ids);
    }
    //购物车携带多个商品
    @Override
    public Car findcar_products(List<Long> ids) {
        CarPo allcar = findAllcar(); //获取购物车
        System.out.println(allcar);
        //获取商品list
        List<ProductDto> byIdProducts = findByIdProducts(ids);
        System.out.println(byIdProducts);
        //new一个Car返回出去
        return new Car().setId(allcar.getId()).setProductPrice(allcar.getProductPrice()).setProductDto(byIdProducts);
    }
}
