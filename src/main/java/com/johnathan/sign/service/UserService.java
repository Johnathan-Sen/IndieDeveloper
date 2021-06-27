package com.johnathan.sign.service;

import com.johnathan.sign.pojo.User;

import java.util.List;

public interface UserService {

    //查询全部用户
    List<User> findAll();
}
