package org.example.client.fallback;

import org.example.client.ProductClient;
import org.example.model.ProductDto;
import org.example.utils.Result;
import org.springframework.stereotype.Component;

@Component
public class FallBackProductClient implements ProductClient {
    @Override
    public Result findAllProduct() {
        return null;
    }

    @Override
    public ProductDto findByIdProduct(int id) {
        return null;
    }
}
