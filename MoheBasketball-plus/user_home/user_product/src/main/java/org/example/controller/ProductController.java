package org.example.controller;

import org.example.mapper.ProductMapper;
import org.example.model.ProductDto;
import org.example.service.ProductService;
import org.example.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;


@RestController
@CrossOrigin
@RequestMapping("/user/product")
public class ProductController {
    @Autowired private ProductService productService;
    @Autowired private ProductMapper productMapper;
    //查询全部产品
    @GetMapping("/getProduct")
    @ResponseBody
    public List<ProductDto> findAllProduct(){
        return  productService.list();
    }
    //查询一个商品
    @GetMapping("/getProduct/{id}")
    @ResponseBody
    public ProductDto findByIdProduct(@PathVariable("id") int id){
        return productService.findById(id);
    }
    //批量查询商品
    @GetMapping("/getProducts")
    public List<ProductDto> findByIdProducts(@RequestParam("ids") List<Long> ids){
        return productService.getProductsByIds(ids);
    }
}
