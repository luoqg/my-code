package com.luoq.designpattern.behavior.chainofresponsibility;

/**
 * @author luoqiang
 * @data 2016/08/22
 */
public abstract class AbstractHandler {

    private Handler handler;

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }
}
