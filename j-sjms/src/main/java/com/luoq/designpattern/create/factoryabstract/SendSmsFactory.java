package com.luoq.designpattern.create.factoryabstract;

import com.luoq.designpattern.create.factorymethod.Sender;
import com.luoq.designpattern.create.factorymethod.SmsSender;

/**
 * @author luoqiang
 * @data 2016/08/22
 */
public class SendSmsFactory implements Provider {
    @Override
    public Sender product() {
        return new SmsSender();
    }
}
//其实这个模式的好处就是，如果你现在想增加一个功能：发及时信息，则只需做一个实现类，实现Sender接口，
//同时做一个工厂类，实现Provider接口，就OK了，无需去改动现成的代码。这样做，拓展性较好！