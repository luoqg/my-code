package com.luoq.designpattern.behavior.chainofresponsibility;

/**
 * @author luoqiang
 * @data 2016/08/22
 */
public class MyHandler extends AbstractHandler implements Handler {

    private String name;

    public MyHandler(String name) {
        this.name = name;
    }

    @Override
    public void operator() {
        System.out.println(name+"deal!");
        if(getHandler()!=null){
            getHandler().operator();
        }
    }
}
