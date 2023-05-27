package org.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.example.model.ProductDto;

@Mapper
public interface ProductMapper extends BaseMapper<ProductDto> {
}
