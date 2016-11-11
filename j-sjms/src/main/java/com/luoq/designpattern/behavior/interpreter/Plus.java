package com.luoq.designpattern.behavior.interpreter;

/**
 * @author luoqiang
 * @data 2016/08/23
 */
public class Plus implements Expression {
    @Override
    public int interpret(Context context) {
        return context.getNum1()+context.getNum2();
    }
}
