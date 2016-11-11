package com.luoq.designpattern.structure.proxy;

/**
 * @author luoqiang
 * @data 2016/08/22
 */
public class ProxyTest {
    public static void main(String[] args) {
        Sourceable source = new Proxy();
        source.method();
    }
}
