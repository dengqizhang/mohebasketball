package org.example.service;

import org.example.model.ProductDto;

import java.util.List;

public interface ProductService {
    List<ProductDto> list();

    ProductDto findById(int id);
}
