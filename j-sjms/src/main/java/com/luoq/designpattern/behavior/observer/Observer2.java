package com.luoq.designpattern.behavior.observer;

/**
 * @author luoqiang
 * @data 2016/08/22
 */
public class Observer2 implements Observer {
    @Override
    public void update() {
        System.out.println("observer2 has received!");
    }
}
