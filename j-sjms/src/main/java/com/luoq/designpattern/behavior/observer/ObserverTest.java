package com.luoq.designpattern.behavior.observer;

/**
 * @author luoqiang
 * @data 2016/08/22
 */
public class ObserverTest {

    public static void main(String[] args) {
        Subject sub = new MySubject();
        sub.add(new Observer1());
        sub.add(new Observer2());

        sub.operation();
    }

}
