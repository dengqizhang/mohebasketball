package org.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.mohebasketball.dto.CommodityDto;

@Mapper
public interface CommodityMapper extends BaseMapper<CommodityDto> {
}
