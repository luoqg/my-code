package com.luoq.designpattern.behavior.visitor;

/**
 * @author luoqiang
 * @data 2016/08/22
 */
public interface Subject {

    void accept(Visitor visitor);

    String getSubject();

}
