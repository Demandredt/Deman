package com.maple.spring6.bean;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    @Test
    public void testSpringBean(){
        Logger logger = LoggerFactory.getLogger(TestSpring.class);
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Application.xml");
        Object userBean = applicationContext.getBean("userBean");

        logger.info("一条消息");
        System.out.println(userBean);
        logger.debug("调试信息");

    }

}
