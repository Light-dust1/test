package com.worldofzuul.controller;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.worldofzuul.mapper.UserMapper;
import com.worldofzuul.pojo.Result;
import com.worldofzuul.pojo.User;
import com.worldofzuul.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Slf4j
@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    //登录
    @PostMapping("/Login")
    public Result login(@RequestBody User user){
        User u=userService.login(user);
        log.info("返回数据:{}",u);
        return u!=null?Result.success(u):Result.error("用户名或密码错误");
    }

    //注册
    @PostMapping
    public Result save(@RequestBody User user){
        System.out.println("在这222222");
        //默认初始值
        user.setCurrentRoom("outside");
        user.setCurrentLoad(0.0);
        userService.add(user);
        return Result.success(user);
    }


  /*  @PutMapping
    public Result<?> update(@RequestBody User user){
        userMapper.updateById(user);
        return Result.success(user);
    }*/
}
