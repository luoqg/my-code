package com.luoq.designpattern.behavior.memento;

/**
 * @author luoqiang
 * @data 2016/08/22
 */
public class Storage {
    private Memento memento;

    public Storage(Memento memento) {
        this.memento = memento;
    }

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
