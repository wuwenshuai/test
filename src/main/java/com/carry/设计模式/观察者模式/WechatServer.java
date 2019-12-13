package com.carry.设计模式.观察者模式;


import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者，也就是微信公众号服务
 */
public class WechatServer implements Observerable {

    private List<Observer> list = new ArrayList<>();
    private String message;

    @Override
    public void registerObserver(Observer observer) {
        list.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(int i = 0; i < list.size(); i++) {
            Observer oserver = list.get(i);
            oserver.update(message);
        }
    }

    public void setInfomation(String s) {
        this.message = s;
        System.out.println("微信服务更新消息： " + s);
        //消息更新，通知所有观察者
        notifyObserver();
    }
}
