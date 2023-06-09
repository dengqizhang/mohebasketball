package org.example.service;

import org.example.model.ProductDto;
import org.example.pojo.ProductPo;

import java.util.List;

public interface ProductService {
    List<ProductDto> list();

//    List<ProductDto> getProductList(String id);
    //查询一个商品
    ProductDto findById(int id);
    //批量查询商品
    List<ProductDto> getProductsByIds(List<Long> ids);
    //传入商品id和要更新的库存数量
   String updateproduct(Integer cid, Integer stock);
    //根据id批量更新商品的库存数量
    void batchUpdateByIds(ProductPo productPo);
}
