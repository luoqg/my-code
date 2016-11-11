package com.luoq.designpattern.structure.bridge;

/**
 * @author luoqiang
 * @data 2016/08/22
 */
public class MyBridge extends Bridge{

    public void method(){
        getSource().method();
    }
    
}
