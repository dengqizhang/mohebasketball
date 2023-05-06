package org.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.example.model.VipUserDto;
@Mapper
public interface VipUserMapper extends BaseMapper<VipUserDto> {
}
