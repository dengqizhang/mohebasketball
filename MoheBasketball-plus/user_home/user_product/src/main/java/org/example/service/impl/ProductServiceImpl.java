package org.example.service.impl;

import org.example.Mapper.ProductMapper;
import org.example.model.ProductDto;
import org.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @Override
    public List<ProductDto> findById1(int[] ids) {
        return productMapper.selectBatchIds(Arrays.asList(ids));
    }


}
