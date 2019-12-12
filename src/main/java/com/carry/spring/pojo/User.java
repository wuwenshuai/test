package com.carry.spring.pojo;


import org.springframework.stereotype.Component;

@Component
public class User {

    String[] users;


    public String[] getUsers() {
        return users;
    }

    public void setUsers(String[] users) {
        this.users = users;
    }
}
