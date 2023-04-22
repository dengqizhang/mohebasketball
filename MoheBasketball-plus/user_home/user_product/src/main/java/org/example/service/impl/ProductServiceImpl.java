package org.example.service.impl;

import org.example.Mapper.ProductMapper;
import org.example.model.ProductDto;
import org.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired private ProductMapper productMapper;
    //查询全部商品
    @Override
    public List<ProductDto> list() {
        return productMapper.selectList(null);
    }

    @Override
    public ProductDto findById(int id) {
        return productMapper.selectById(id);
    }
}
