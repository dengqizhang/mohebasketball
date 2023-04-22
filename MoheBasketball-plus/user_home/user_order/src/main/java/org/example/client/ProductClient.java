package org.example.client;

import org.example.client.fallback.FallBackProductClient;
import org.example.model.ProductDto;
import org.example.utils.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "product-service",fallbackFactory = FallBackProductClient.class)
public interface ProductClient {

    @GetMapping("/getProduct")
    Result findAllProduct();

    @GetMapping("/getProduct/{id}")
    ProductDto findByIdProduct(@PathVariable("id") int id);
}
