package com.luoq.designpattern.behavior.mediator;

/**
 * @author luoqiang
 * @data 2016/08/22
 */
public class User1 extends User {

    public User1(Mediator mediator){
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("user1 exe!");
    }
}
