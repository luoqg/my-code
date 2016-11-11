package com.luoq.designpattern.behavior.iterator;

/**
 * @author luoqiang
 * @data 2016/08/22
 */
public interface Collection {

    public Iterator iterator();

    /*取得集合元素*/
    public Object get(int i);

    /*取得集合大小*/
    public int size();
}
