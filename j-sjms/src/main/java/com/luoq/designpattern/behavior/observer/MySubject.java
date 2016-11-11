package com.luoq.designpattern.behavior.observer;

/**
 * @author luoqiang
 * @data 2016/08/22
 */
public class MySubject extends AbstractSubject {

    @Override
    public void operation() {
        System.out.println("update self!");
        notifyObservers();
    }

}
