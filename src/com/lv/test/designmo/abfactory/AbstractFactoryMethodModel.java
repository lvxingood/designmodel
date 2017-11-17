package com.lv.test.designmo.abfactory;

/**
 * ���󹤳�����ģʽ
 * ���󹤳�����ģʽ���ڹ�������ģʽ���ϵ��ݻ�
 * ��������ģʽ��һ��ȱ����ǵ���Ҫ�޸Ļ�����չ��������Ѿ�д�õĹ��������޸ģ���Υ���˿���ԭ��
 * ���Դ���ƵĽǶȣ�������Ҫ�޸ġ�
 * �취���ǶԹ�������һ�¡�����������ӿڡ�
 * Ŀ��ӿڵ�ʵ�����м��֣����ǾͶ�����ٸ�����ʵ���ࡣ
 * 
 * @author lenovo
 *
 */
public class AbstractFactoryMethodModel {
    //���Գ��󹤳�����ģʽ
	public static void main(String[] args) {
		SmsSenderProvider.produce().send();
		EmailSenderProvider.produce().send();
	}
}


interface Sender {
	public void send();
}

class SmsSender implements Sender {
	public void send() {
        System.out.println("sms send ...");		
	}
}

class EmailSender implements Sender {
	public void send() {
        System.out.println("email send ...");		
	}
}

interface Provider {
	public static  Sender produce() {return null;};
}

class SmsSenderProvider implements Provider {
	
	public static Sender produce() {
		return new SmsSender();
	}
} 

class EmailSenderProvider implements Provider {
	public static Sender produce() {
		return new EmailSender();
	}
} 
















