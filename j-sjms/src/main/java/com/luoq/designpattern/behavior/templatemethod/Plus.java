package com.luoq.designpattern.behavior.templatemethod;

/**
 * @author luoqiang
 * @data 2016/08/22
 */
public class Plus extends AbstractCalculator {
    @Override
    public int calculate(int num1, int num2) {
        return num1+num2;
    }
}
