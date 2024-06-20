package com.worldofzuul.service;

import com.worldofzuul.pojo.User;

public interface UserService {

    void add(User user);

    User login(User user);
}
