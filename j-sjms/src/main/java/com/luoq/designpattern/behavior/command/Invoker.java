package com.luoq.designpattern.behavior.command;

/**
 * @author luoqiang
 * @data 2016/08/22
 */
public class Invoker {

    private Command command;

    public Invoker(Command command){
        this.command = command;
    }

    public void action(){
        command.exe();
    }

}
