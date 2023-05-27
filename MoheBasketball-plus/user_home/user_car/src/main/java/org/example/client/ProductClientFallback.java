package org.example.client;

import org.example.model.ProductDto;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductClientFallback implements ProductClient{

    @Override
    public List<ProductDto> findByIdProducts(List<Long> ids) {
        return null;
    }

    @Override
    public List<ProductDto> findAllProduct() {
        return null;
    }

    @Override
    public ProductDto findByIdProduct(int id) {
        return null;
    }
}
