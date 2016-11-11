package com.luoq.designpattern.structure.adapter;

/**
 * @author luoqiang
 * @data 2016/08/22
 */
public class Adapter extends Source implements Targetable {

    @Override
    public void method2() {
        System.out.println("this is the targetable mehtod!");
    }
}
