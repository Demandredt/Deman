package com.maple.spring.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserDao {

    private static final Logger logger = LoggerFactory.getLogger("UserDao");
    public void insert(){
        System.out.println("正在insert信息");
        logger.info("插入信息");
    }
}
