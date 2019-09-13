package com.shuai.twitter.api.impl;

import com.shuai.twitter.api.dao.UserDao;
import com.shuai.twitter.api.entity.User;
import com.shuai.twitter.api.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User create(User user) {
        return userDao.save(user);
    }
}