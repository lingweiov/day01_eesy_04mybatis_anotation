package com.ithaima.dao;/*
@outhor shkstart
@date 2019/12/11-11:22
*/

import com.ithaima.domain.User;

import java.util.List;

public interface IUserDao {
    List<User> findAll();
}
