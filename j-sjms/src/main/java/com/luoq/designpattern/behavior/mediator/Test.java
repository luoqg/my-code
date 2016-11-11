package com.luoq.designpattern.behavior.mediator;

/**
 * @author luoqiang
 * @data 2016/08/22
 */
public class Test {

    public static void main(String[] args) {
        Mediator mediator = new MyMediator();
        mediator.createMediator();
        mediator.workAll();
    }
}
