package org.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.example.domin.Order;
import org.example.pojo.OrderPo;

@Mapper
public interface OrderMapper extends BaseMapper<OrderPo> {
}
