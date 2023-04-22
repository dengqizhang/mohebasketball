package org.example.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import org.example.mapper.CommodityMapper;
import org.example.service.CommodityService;
import org.mohebasketball.dto.CommodityDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommodityImpl implements CommodityService {

    @Autowired private CommodityMapper commodityMapper;
    /*
    查询所有的商品
     */
    @Override
    public List<CommodityDto> findAllList() {
        return commodityMapper.selectList(null);
    }
    /*
    查询一个商品
     */
    @Override
    public CommodityDto findById(int id) {
        return commodityMapper.selectById(id);
    }

}
