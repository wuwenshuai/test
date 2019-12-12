package com.carry.spring;

import com.carry.spring.config.AppConfig;
import com.carry.spring.postprocessor.UserPostProcessor;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDemo {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext an = new AnnotationConfigApplicationContext(AppConfig.class);
        UserPostProcessor bean = an.getBean(UserPostProcessor.class);
        System.out.println(bean);
        //User user = (User) an.getBean("user");
       // System.out.println(user);
    }
}
