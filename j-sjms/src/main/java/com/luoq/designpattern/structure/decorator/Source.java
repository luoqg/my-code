package com.luoq.designpattern.structure.decorator;

/**
 * @author luoqiang
 * @data 2016/08/22
 */
public class Source implements Sourceable {
    @Override
    public void method() {
        System.out.println("the original method!");
    }
}
