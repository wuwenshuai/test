package com.carry.设计模式.观察者模式;


/**
 * 抽象观察者
 * 定义了一个update方法，当被观察者调用notifyObservers（）方法，观察者的update()方法会被回调
 */
public interface Observer {

    void update(String message);
}
