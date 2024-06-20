package com.worldofzuul.mapper;

import com.worldofzuul.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper//在运行时，会自动生成该接口的实现类对象（代理对象），并且将该对象交给IOC容器管理

public interface UserMapper{
    @Insert("insert into User(name,password,currentRoom,currentLoad) values(#{name},#{password},#{currentRoom},#{currentLoad})")
    void add(User user);

    @Select("select * from User where name=#{name} and password=#{password}")
    User getByUserAndPassword(User user);
}