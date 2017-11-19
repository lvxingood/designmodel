package com.lv.test.designmo.builder;

import java.util.Vector;

/**
 * 建造者模式其实是将抽象工厂类中的所有的目标接口的实现类都打包放在一起
 * @author lvxin
 *
 */
public class BuilderModel {

}

interface Sender {
    public void send();
}


class SmsSender implements Sender {
    public void send() {
        System.out.println("send sms ...");
    }
}

class EmailSender implements Sender {
   public void send() {
       System.out.println("send email ...");
   }
}

class BuilderFactory {
    Vector<Sender> senders =  new Vector<>();
    
    public void produceSms (int count) {
        for(int i =0 ;i < count;i++) {
            senders.add(new SmsSender());
        }
    }
    
    public void produceEmail (int count) {
        for(int i =0 ;i < count;i++) {
            senders.add(new EmailSender());
        }
    }
}