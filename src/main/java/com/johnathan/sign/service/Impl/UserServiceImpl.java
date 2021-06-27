package com.johnathan.sign.service.Impl;

import com.johnathan.sign.mapper.UserMapper;
import com.johnathan.sign.pojo.User;
import com.johnathan.sign.service.UserService;

import javax.annotation.Resource;
import java.util.List;

public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

//    查询全部用户
    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }
}
