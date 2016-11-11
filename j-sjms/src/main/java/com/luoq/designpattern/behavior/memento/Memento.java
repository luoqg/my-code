package com.luoq.designpattern.behavior.memento;

/**
 * @author luoqiang
 * @data 2016/08/22
 */
public class Memento {

    private String value;

    public Memento(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
