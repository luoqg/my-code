package com.luoq.designpattern.behavior.strategy;

/**
 * @author luoqiang
 * @data 2016/08/22
 */
public class Multiply extends AbstractCalclator implements ICalculator {
    @Override
    public int calculate(String exp) {
        int arrayInt[] = split(exp,"\\*");
        return arrayInt[0]*arrayInt[1];
    }
}
