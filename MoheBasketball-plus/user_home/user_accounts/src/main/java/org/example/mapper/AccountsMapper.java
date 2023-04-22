package org.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.example.model.AccountsDto;

@Mapper
public interface AccountsMapper extends BaseMapper<AccountsDto> {
}
