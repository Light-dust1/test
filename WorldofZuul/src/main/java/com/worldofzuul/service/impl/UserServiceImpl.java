package com.worldofzuul.service.impl;

import com.worldofzuul.mapper.UserMapper;
import com.worldofzuul.pojo.User;
import com.worldofzuul.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void add(User user) {userMapper.add(user);}

    @Override
    public User login(User user) {return userMapper.getByUserAndPassword(user);}
}
