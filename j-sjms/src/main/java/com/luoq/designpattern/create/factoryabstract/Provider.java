package com.luoq.designpattern.create.factoryabstract;

import com.luoq.designpattern.create.factorymethod.Sender;

/**
 * @author luoqiang
 * @data 2016/08/22
 */
public interface Provider {

    Sender product();

}
