package org.example.service;

import org.example.model.ProductDto;

import java.util.List;

public interface ProductService {
    //    查询所有商品
    List<ProductDto> findallList();

    //      根据id删除商品
     void deleteProduct(Integer id);
    //添加商品
    void add(ProductDto productDto);
    //修改商品
    void updateProduct(ProductDto productDto);
}
