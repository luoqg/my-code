package com.luoq.designpattern.structure.decorator;

/**
 * @author luoqiang
 * @data 2016/08/22
 */
public class DecoratorTest {
    public static void main(String[] args) {
        Sourceable source = new Source();
        Sourceable obj = new Decorator(source);
        obj.method();
    }
}
