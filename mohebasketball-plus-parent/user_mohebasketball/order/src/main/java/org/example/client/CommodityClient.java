package org.example.client;

import org.example.config.Result;
import org.mohebasketball.dto.CommodityDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "Commodity-service",fallback = CommodityClientFallback.class) //远程调用地址,默认解码器传递json数据，如果封装了Result对象，调用不过来，可以在此次修改。
public interface CommodityClient {

//    调用查询全部商品的方法
    @GetMapping("/getCommodity")
    List<CommodityDto> findAllCommodity();
    //    调用查询一个商品的方法
    @GetMapping(value = "/getCommodity/{id}")
    CommodityDto findCommodityById(@PathVariable("id") int id);
}
