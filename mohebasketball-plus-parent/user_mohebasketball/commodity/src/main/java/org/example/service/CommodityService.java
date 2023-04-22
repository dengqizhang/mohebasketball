package org.example.service;

import org.mohebasketball.dto.CommodityDto;

import java.util.List;

public interface CommodityService {
    //查询所有的商品
    List<CommodityDto> findAllList();
    //查询一个商品
    CommodityDto findById(int id);
}
