package com.luoq.designpattern.create.factorymethod;

/**
 * 静态工厂方法模式
 * @author luoqiang
 * @data 2016/08/22
 */
public class SendFactoryStatic {

    public static Sender productMail(){
        return  new MailSender();
    }

    public static Sender productSms(){
        return new SmsSender();
    }

}
