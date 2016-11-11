package com.luoq.designpattern.behavior.visitor;

/**
 * @author luoqiang
 * @data 2016/08/22
 */
public class MyVisitor implements Visitor {
    @Override
    public void visitor(Subject sub) {
        System.out.println("visit the subject："+sub.getSubject());
    }
}
