package org.example.service.impl;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import org.example.mapper.ProductMapper;
import org.example.model.ProductDto;
import org.example.pojo.ProductPo;
import org.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
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
    //查询一个商品
    @Override
    public ProductDto findById(int id) {
        return productMapper.selectById(id);
    }
    //批量查询商品
    @Override
    public List<ProductDto> getProductsByIds(List<Long> ids) {
        return productMapper.selectBatchIds(ids);
    }
    //传入商品id和要更新的库存数量
    @Override
    @Transactional
    public String updateproduct(Integer cid, Integer stock) {
        //查询产品的当前库存数量
        int currentStock = productMapper.getStock(cid);
        if (currentStock == 0){
            //如果当前库存数量为0，则返回错误信息
            return "暂无库存";
        }
        //更新产品的库存数量
        int updated = productMapper.decreaseStock(cid, stock);
        if (updated == 0){
            //如果更新失败，则返回错误信息
            throw new RuntimeException("更新库存失败");
        }
        //更新成功，返回成功信息
        return "更新库存成功";
    }
    //根据id批量更新商品的库存数量
    @Override
    public void batchUpdateByIds(ProductPo productPo) {
        Map<Integer,Integer> idStockMap =  productPo.getIdStockMap();
        if (idStockMap == null || idStockMap.isEmpty()){
            return;
        }
        List<Integer> ids = new ArrayList<>();
        List<Integer> stocks = new ArrayList<>();
        for (Map.Entry<Integer,Integer> entry : idStockMap.entrySet()){
            Integer id = entry.getKey();
            Integer stock = entry.getValue();
            ids.add(id);
            stocks.add(stock);
        }
        productMapper.batchUpdateByIds(ids,stocks);
    }

}
