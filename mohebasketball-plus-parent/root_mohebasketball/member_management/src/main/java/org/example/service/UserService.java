package org.example.service;

import org.apache.ibatis.annotations.Delete;
import org.example.pojo.User;

import java.util.List;

public interface UserService {

    /*
    查询全部会员数据
     */
    List<User> list();
    /*
    删除会员
     */
    void delete(Integer id);
    /*
    新增会员
     */
    void add(User user);
    /*
    修改会员信息
     */
    void update(User user);
}
