package com.huawei.controller;


import com.huawei.dao.UserDao;
import com.huawei.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserDao userDao;

    @RequestMapping("aaa")
    public List<User> findAll(){
        return userDao.findAll();
    }
}
