package com.luoq.designpattern.create.singleton;

/**
 * 单例模式
 * @author luoqiang
 * @data 2016/08/22
 */
public class Singleton1 {

    private static Singleton1 instance = null;

    private Singleton1(){

    }

    private static synchronized void syncInit(){
        if(instance == null){
            instance  = new Singleton1();
        }
    }

    public static Singleton1 getInstance(){
        if(instance == null){
            syncInit();
        }
        return instance;
    }

}
//因为我们只需要在创建类的时候进行同步，所以只要将创建和getInstance()分开，单独为创建加synchronized关键字
