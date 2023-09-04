package com.maple.spring.service;

import com.maple.spring.dao.UserDao;

public class UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }
    public void saveUser(){
        userDao.insert();

    }
}
