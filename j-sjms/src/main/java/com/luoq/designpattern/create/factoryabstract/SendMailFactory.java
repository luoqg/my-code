package com.luoq.designpattern.create.factoryabstract;


import com.luoq.designpattern.create.factorymethod.MailSender;
import com.luoq.designpattern.create.factorymethod.Sender;

/**
 * @author luoqiang
 * @data 2016/08/22
 */
public class SendMailFactory implements Provider {

    @Override
    public Sender product() {
        return new MailSender();
    }
}
