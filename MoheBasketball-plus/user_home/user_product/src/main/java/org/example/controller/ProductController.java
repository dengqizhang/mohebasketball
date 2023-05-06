package org.example.controller;

import org.example.model.ProductDto;
import org.example.service.ProductService;
import org.example.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.*;
import java.util.List;


@RestController
@CrossOrigin
public class ProductController {
    @Autowired private ProductService productService;
    //查询全部产品
    @GetMapping("/getProduct")
    public List<ProductDto> findAllProduct(){
        return  productService.list();
    }

//    //查询全部产根据订单id
//    @GetMapping("/getProductByOrderId/{id}")
//    public List<ProductDto> getProductByOrderId(@PathVariable("id") String id){
//        return  productService.getProductList(id);
//    }
    //查询一个商品
    @GetMapping("/getProduct/{id}")
    @ResponseBody
    public ProductDto findByIdProduct(@PathVariable("id") int id){

        return productService.findById(id);
    }
    //批量查询商品
    @GetMapping("/getProduct1")
    @ResponseBody
    public List<ProductDto> findByIdProduct1(@RequestParam("ids") int[] ids){
        return productService.findById1(ids);
    }
}
