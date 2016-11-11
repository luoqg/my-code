package com.luoq.designpattern.structure.bridge;

/**
 * @author luoqiang
 * @data 2016/08/22
 */
public class SourceSub1 implements Sourceable {
    @Override
    public void method() {
        System.out.println("this is the first sub!");
    }
}
