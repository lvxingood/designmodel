package com.lv.test.designmo.abfactory;

/**
 * 抽象工厂方法模式
 * 抽象工厂方法模式是在工厂方法模式的上的演化
 * 工厂方法模式的一个缺点就是当需要修改或者扩展，必须对已经写好的工厂类做修改，这违反了开闭原则。
 * 所以从设计的角度，我们需要修改。
 * 办法就是对工厂抽象一下。定义个工厂接口。
 * 目标接口的实现类有几种，我们就定义多少个工厂实现类。
 * 
 * @author lenovo
 *
 */
public class AbstractFactoryMethodModel {
    //测试抽象工厂方法模式
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
















