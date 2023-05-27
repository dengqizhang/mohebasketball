package org.example.service.impl;

import org.example.mapper.ProductMapper;
import org.example.model.ProductDto;
import org.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired private ProductMapper productMapper;

    //查询所有商品
    @Override
    public List<ProductDto> findallList() {
        return productMapper.selectList(null);
    }
    //根据id删除商品
    @Override
    public void deleteProduct(Integer id) {
        productMapper.deleteById(id);
    }
    //增加商品
    @Override
    public void add(ProductDto productDto) {
        productMapper.insert(productDto);
    }
    //根据id修改商品
    @Override
    public void updateProduct(ProductDto productDto) {
        productMapper.updateById(productDto);
    }
}
