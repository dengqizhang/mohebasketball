package org.example.service.servicelmpl;

import org.example.mapper.UserMapper;
import org.example.pojo.User;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class UserServiceLmpl implements UserService {

    @Autowired
    private UserMapper userMapper;



/*
实现接口中的方法
 */
    /*
    查询
     */
    @Override
    public List<User> list() {
        return userMapper.selectList(null);
    }
    /*
    删除
     */
    @Override
    public void delete(Integer id) {
        userMapper.deleteById(id);
    }
/*
新增
 */
    @Override
    public void add(User user) { //前端提交的数据
        user.setCreateTime(Timestamp.valueOf(LocalDateTime.now()));
        user.setUpdateTime(Timestamp.valueOf(LocalDateTime.now()));
        userMapper.insert(user);
    }
    /*
    修改用户
     */
    @Override
    public void update(User user) {
        userMapper.updateById(user);

    }
}
