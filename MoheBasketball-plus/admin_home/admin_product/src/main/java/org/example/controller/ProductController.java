package org.example.controller;

import org.example.model.ProductDto;
import org.example.service.ProductService;
import org.example.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin/product")
public class ProductController {
    @Autowired
    private ProductService productService;
//    查询所有商品
    @GetMapping("/getAdminProduct")
    public List<ProductDto> findallproduct(){
        return productService.findallList();
    }
//    删除一条商品
    @PostMapping("/deleteProduct/{id}")
    public void deleteProduct(@PathVariable Integer id){
        productService.deleteProduct(id);
    }
    //增加商品
    @PostMapping("/addProduct")
    public void addProduct(ProductDto productDto){
        productService.add(productDto);
     }
     //根据id修改商品
    @PostMapping("/updateproduct/{id}")
    @ResponseBody
    public String updateProduct(@PathVariable("id") int id, ProductDto productDto){
        productDto.setId(id);
        productService.updateProduct(productDto);
        return "success";
    }
}
