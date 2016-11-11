package com.luoq.designpattern.behavior.mediator;

/**
 * @author luoqiang
 * @data 2016/08/22
 */
public class User2 extends User {

    public User2(Mediator mediator){
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("user1 exe!");
    }
}
