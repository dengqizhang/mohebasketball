package org.example.controller;
import org.example.mapper.ProductMapper;
import org.example.model.ProductDto;
import org.example.pojo.ProductPo;
import org.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/user/product")
public class ProductController {
    @Autowired private ProductService productService;
    @Autowired private ProductMapper productMapper;
    //查询全部产品
    @GetMapping("/getProduct")
    public List<ProductDto> findAllProduct(){
        return  productService.list();
    }
    //查询一个商品
    @GetMapping("/getProduct/{id}")
    public ProductDto findByIdProduct(@PathVariable("id") int id){
        return productService.findById(id);
    }
    //批量查询商品
    @GetMapping("/getProducts")
    public List<ProductDto> findByIdProducts(@RequestParam("ids") List<Long> ids){
        return productService.getProductsByIds(ids);
    }
    //传入商品id和要更新的库存数量
    @PostMapping("/updateproduct")
    public ResponseEntity<String> updataproduct(@RequestParam("cid") Integer cid, @RequestParam("stock") Integer stock){
         String result = productService.updateproduct(cid,stock);
         return ResponseEntity.ok(result);
    }
    //根据id批量更新商品的库存数量
    @PostMapping("/batchUpdateByIds")
    public void batchUpdateByIds(@RequestBody ProductPo productPo){
        System.out.println(productPo);
        productService.batchUpdateByIds(productPo);
    }
}
