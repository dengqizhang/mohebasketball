package org.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.example.model.ProductDto;

import java.util.List;

@Mapper //查询产品dto
public interface ProductMapper extends BaseMapper<ProductDto> {

}
