package com.shuai.twitter.api.controller;

import com.shuai.twitter.api.dao.UserDao;
import com.shuai.twitter.api.entity.User;
import com.shuai.twitter.api.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping({"/api"})
//@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
    @Autowired
    private UserService userService;

    //ajouter un user
    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public User create(User user) {
        System.out.println("create user");
//        return userService.create(user);
        return null;
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ResponseBody
    public String getFoosBySimplePath() {
        return "Get some Foos";
    }

}
