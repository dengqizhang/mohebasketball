package org.example.service.impl;

import org.example.mapper.ProductMapper;
import org.example.model.ProductDto;
import org.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired private ProductMapper productMapper;
    //查询全部商品
    @Override
    public List<ProductDto> list() {
        return productMapper.selectList(null);
    }

//    @Override
//    public List<ProductDto> getProductList(String id) {
//        Map<String,Object> map = new HashMap<String,Object>();
//        map.put("",id);
//        return productMapper.selectByMap();
//    }

    @Override
    public ProductDto findById(int id) {
        return productMapper.selectById(id);
    }
    //批量查询商品
    @Override
    public List<ProductDto> getProductsByIds(List<Long> ids) {
        return productMapper.selectBatchIds(ids);
    }


}
