package com.shuai.twitter.api.controller;

import com.shuai.twitter.api.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserDao userDao;
}
