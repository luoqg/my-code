package com.luoq.designpattern.structure.facade;

/**
 * @author luoqiang
 * @data 2016/08/22
 */
public class User {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.startup();
        computer.shutdown();
    }
}
