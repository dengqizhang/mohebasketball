package org.example.controller;
import org.example.config.Result;
import org.example.mapper.CommodityMapper;
import org.example.service.CommodityService;
import org.mohebasketball.dto.CommodityDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class CommodityController {
    @Autowired private CommodityService commodityService;
    /*
    查询所有
     */
    @GetMapping("/getCommodity")
    @ResponseBody
    public List<CommodityDto> findAllCommodity(){
        return commodityService.findAllList();
    }
    /*
    查询一个商品
     */
    @GetMapping("/getCommodity/{id}")
    @ResponseBody
    public CommodityDto getCommodityId(@PathVariable("id") int id){
        return commodityService.findById(id);

    }
}
