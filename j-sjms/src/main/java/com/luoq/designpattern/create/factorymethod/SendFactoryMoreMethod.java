package com.luoq.designpattern.create.factorymethod;

/**
 * 多个工厂方法模式
 * @author luoqiang
 * @data 2016/08/22
 */
public class SendFactoryMoreMethod {

    public Sender productMail(){
        return new MailSender();
    }

    public Sender productSms(){
        return new SmsSender();
    }

}
