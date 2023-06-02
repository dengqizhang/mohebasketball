package org.example.client;
import org.example.model.ProductDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "product-service",url = "http://localhost:9002/user/product")
@CrossOrigin
public interface ProductClient {
    //批量查询的服务路径
    @GetMapping("/getProducts")
    List<ProductDto> findByIdProducts(@RequestParam("ids") List<Long> ids);
    //查询所有的服务路径
    @GetMapping("/getProduct")
    List<ProductDto> findAllProduct();
    //根据id查询的服务路径
    @GetMapping("/getProduct/{id}")
    @ResponseBody
    ProductDto findByIdProduct(@PathVariable("id") int id);
}
