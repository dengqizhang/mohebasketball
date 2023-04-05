package org.example.Administratorlogin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.example.Administratorlogin.pojo.User;
@Mapper
public interface AdministratorloginMapper extends BaseMapper<User> {
    //查询tb_administrator表里的信息
//    @Select("select * from tb_administrator where username = #{username} and password = #{password}")
//    User getByUsernameAndPassword(User administratorloginUser);

}
