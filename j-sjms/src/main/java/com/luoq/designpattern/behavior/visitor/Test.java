package com.luoq.designpattern.behavior.visitor;

/**
 * @author luoqiang
 * @data 2016/08/22
 */
public class Test {

    public static void main(String[] args) {

        Visitor visitor = new MyVisitor();
        Subject sub = new MySubject();
        sub.accept(visitor);
    }

}
