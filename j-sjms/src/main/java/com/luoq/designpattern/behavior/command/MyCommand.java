package com.luoq.designpattern.behavior.command;

/**
 * @author luoqiang
 * @data 2016/08/22
 */
public class MyCommand implements Command {

    private Receiver receiver;

    public MyCommand(Receiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void exe() {
        receiver.action();
    }
}
