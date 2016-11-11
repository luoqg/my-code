package com.luoq.designpattern.create.builder;



import java.util.ArrayList;
import java.util.List;
import com.luoq.designpattern.create.factorymethod.*;

/**
 * @author luoqiang
 * @data 2016/08/22
 */
public class Builder {

    private List<Sender> list = new ArrayList<Sender>();

    public void productMailSender(int count){
        for (int i = 0; i < count; i++) {
            list.add(new MailSender());
        }
    }

    public void productSmsSender(int count){
        for (int i = 0; i < count; i++) {
            list.add(new SmsSender());
        }
    }
}
