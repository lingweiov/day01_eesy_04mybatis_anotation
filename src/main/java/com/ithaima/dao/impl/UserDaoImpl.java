package com.ithaima.dao.impl;/*
@outhor shkstart
@date 2019/12/11-18:46
*/


import com.ithaima.dao.IUserDao;
import com.ithaima.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class UserDaoImpl implements IUserDao {
    private SqlSessionFactory factory;

    public UserDaoImpl(SqlSessionFactory factory) {
        this.factory = factory;
    }

    @Override
    public List<User> findAll() {
        SqlSession session = factory.openSession();
        List<User> users = session.selectList("com.ithaima.dao.IUserDao.findAll");
        session.close();
        return users;
    }
}
