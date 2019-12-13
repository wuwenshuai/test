package com.carry.设计模式.观察者模式;


/**
 * 抽象被观察者对象
 * 声明添加，删除，通知观察者的方法
 */
public interface Observerable {

    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver();
}
