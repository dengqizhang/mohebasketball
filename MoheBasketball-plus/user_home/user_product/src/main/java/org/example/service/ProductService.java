package org.example.service;

import org.example.model.ProductDto;

import java.util.List;

public interface ProductService {
    List<ProductDto> list();

//    List<ProductDto> getProductList(String id);

    ProductDto findById(int id);

    List<ProductDto> findById1(int[] ids);
}
