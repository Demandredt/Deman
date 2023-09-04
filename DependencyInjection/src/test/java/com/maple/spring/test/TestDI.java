package com.maple.spring.test;

import com.maple.spring.service.UserService;
import com.maple.spring.service.VipService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDI {

    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Application.xml");
        UserService userService = applicationContext.getBean("userServiceBean", UserService.class);
        userService.saveUser();
    }


    @Test
    public void testConstructorDI(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Cons.xml");
        VipService vipService = applicationContext.getBean("vipServiceBean", VipService.class);
        vipService.save();
    }
}

