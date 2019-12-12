package com.carry.spring.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;


@Service
public class TestService {

    @Autowired
    private StuService stuServiceImpl1;

    @PostConstruct
    public void init(){
        System.out.println(stuServiceImpl1.getClass().getName());
    }
}
