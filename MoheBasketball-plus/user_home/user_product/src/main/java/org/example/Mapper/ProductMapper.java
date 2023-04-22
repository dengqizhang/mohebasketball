package org.example.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.example.model.ProductDto;
@Mapper //查询产品dto
public interface ProductMapper extends BaseMapper<ProductDto> {
}
