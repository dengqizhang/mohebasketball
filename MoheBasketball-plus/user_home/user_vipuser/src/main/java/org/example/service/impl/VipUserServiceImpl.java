package org.example.service.impl;

import org.example.mapper.VipUserMapper;
import org.example.model.VipUserDto;
import org.example.service.VipUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VipUserServiceImpl implements VipUserService {
    @Autowired private VipUserMapper vipUserMapper;
    @Override
    public List<VipUserDto> findAllList() {
        return vipUserMapper.selectList(null);
    }
}
