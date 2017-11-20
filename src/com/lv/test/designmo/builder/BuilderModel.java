package com.lv.test.designmo.builder;

import java.util.Vector;

/**
 * ������ģʽ��ʵ�ǽ����󹤳����е����е�Ŀ��ӿڵ�ʵ���඼�������һ��
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