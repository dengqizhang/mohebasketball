package org.example.service.impl;

import org.example.mapper.VipMapper;
import org.example.pojo.Vip;
import org.example.service.VipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VipServiceImpl implements VipService {
    @Autowired
    VipMapper vipMapper;
    //查询全部会员
    @Override
    public List<Vip> findallVipList() {
        return vipMapper.selectList(null);
    }
    //根据id删除会员
    @Override
    public int deletevip(int id) {
       return vipMapper.deleteById(id);
    }
}
