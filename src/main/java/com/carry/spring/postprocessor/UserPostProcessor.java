package com.carry.spring.postprocessor;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;


@Component
public class UserPostProcessor implements ApplicationContextAware {
    // 拿到管理他的spring容器
    private ApplicationContext applicationContext;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @Override
    public String toString() {
        return "UserPostProcessor{" +
                "applicationContext=" + applicationContext +
                '}';
    }
}
