package com.luoq.designpattern.behavior.visitor;

/**
 * @author luoqiang
 * @data 2016/08/22
 */
public class MySubject implements Subject {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitor(this);
    }

    @Override
    public String getSubject() {
        return "love";
    }
}
