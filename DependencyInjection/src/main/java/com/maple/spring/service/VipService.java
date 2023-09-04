package com.maple.spring.service;

import com.maple.spring.dao.UserDao;
import com.maple.spring.dao.VipDao;

public class VipService {
    private UserDao userDao;
    private VipDao vipDao;


    public VipService(UserDao userDao, VipDao vipDao) {
        this.userDao = userDao;
        this.vipDao = vipDao;
    }

    public void save(){
        userDao.insert();
        vipDao.insert();

    }
}
