package com.luoq.designpattern.behavior.mediator;

/**
 * @author luoqiang
 * @data 2016/08/22
 */
public abstract class User {

    private Mediator mediator;

    public Mediator getMediator(){
        return mediator;
    }

    public User(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void work();

}
