package com.luoq.designpattern.behavior.command;

/**
 * @author luoqiang
 * @data 2016/08/22
 */
public class Test {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command cmd = new MyCommand(receiver);
        Invoker invoker = new Invoker(cmd);
        invoker.action();
    }
}