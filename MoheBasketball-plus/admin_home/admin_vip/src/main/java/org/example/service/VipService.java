package org.example.service;

import org.example.pojo.Vip;

import java.util.List;

public interface VipService {
    //查询全部会员
    List<Vip> findallVipList();
    //根据id删除会员
    int deletevip(int id);
}
