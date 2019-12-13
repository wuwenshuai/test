package com.carry.设计模式.观察者模式;


import lombok.Data;

/**
 * 具体观察者，微信公众号为用户user
 */

@Data
public class User implements Observer {

    private String name;
    private String message;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        this.message = message;
        read();
    }

    public void read() {
        System.out.println(name + " 收到推送消息： " + message);
    }

}
