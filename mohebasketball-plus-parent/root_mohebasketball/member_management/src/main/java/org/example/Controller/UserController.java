package org.example.Controller;

import javafx.scene.DepthTest;
import lombok.extern.slf4j.Slf4j;
import org.example.config.Result;
import org.example.pojo.User;
import org.example.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
public class UserController {
    @Autowired
    private UserService userService;

    /*
    修改会员信息
     */
    @PostMapping("/update")
    public Result update(@RequestBody User user){

        log.info("修改信息为：" , user);

        userService.update(user);
        return Result.success();
    }

    /*
    增加会员
     */
    @PostMapping("/depts")
    public Result add(@RequestBody User user){ //前端传入json数据，后端使用Body来进行接收到实体类
        log.info("新增部门：{}" , user);
        userService.add(user);
        return Result.success();

    }
    /*
    删除会员
     */
    @DeleteMapping("/depts/{id}")
    public Result delete(@PathVariable Integer id){
        log.info("根据id删除会员：{}",id);
        //调用service删除会员
        userService.delete(id);
        return Result.success();
    }

    /*
    查询全部会员
     */
    @GetMapping ("/depts")
    public Result list(){

       log.info("查询全部数据");

       //调用sercice查询会员数据
        List<User> userList = userService.list();

        return Result.success(userList);
    }
}
