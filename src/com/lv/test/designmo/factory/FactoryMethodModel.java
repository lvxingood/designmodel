package com.lv.test.designmo.factory;

/**
 * 工厂方法模式
 * 工厂方法模式是属于设计模式中的创建型
 * 工厂方法模式有三种。简单工厂方法模式、多个工厂方法模式、静态工厂方法模式
 * 所谓工厂方法，就是通过工厂类来创建对象实例。说白了就是定义一个类专门用来去创建目标类
 * @author lenovo
 *
 */
public class FactoryMethodModel {
	
	public static void main(String[] args) {
		FactoryMethodModel fmm = new FactoryMethodModel();
		//测试简单工厂模式
		SimpleFactory  sf = new SimpleFactory();
		sf.produce("sms").send();
		sf.produce("email").send();
		
		//测试多个工厂方法
		SimpleStaticFactory ssf = new SimpleStaticFactory();
		ssf.produceEmail().send();
		ssf.produceSms().send();
		
		//测试静态工厂方法
		
		SimpleStaticFactory2.produceEmail().send();
		SimpleStaticFactory2.produceSms().send();
	}
    
}

/**
 * 简单工厂方法模式非常简单。
 * 一个工厂类。工厂类定义了一个方法用来生成目标对象。该方法是一个public类型的返回值为目标类接口类型。可能会有个入参用来区分是哪个具体的接口实现类。
 */

interface Sender {
	public void send();
}

class SmsSender implements Sender {
	public void send() {
		System.out.println("sms send...");
	}
}

class MailSender implements Sender {
	public void send() {
        System.out.println("email send...");		
	}
}

class SimpleFactory {
	public Sender produce(String type) {
		if("sms".equals(type)) {
			return new SmsSender();
		}
		if ("email".equals(type)) {
			return new MailSender();
		}
		return null;
	}
}

/*======================================================================================================================================================================*/

/**
 *多个工厂方法模式
 * 此方法是基于简单工厂方法模式做的改进
 * 简单工厂方法模式需要在调用工厂方法的时候传入一个要生成的具体目标接口的实现对象的实例。
 * 这样的话对于用户体验不好，输入错了的话将会产生错误的对象或者生成不了。
 * 另外如果做了变动的话。工厂类的if要跟着变化。另外的话以后实现类越来越多。工厂方法会越来越长。导致后期维护比较困难。
 * 所以多个工厂方法是在简答工厂方法的基础上将方法根据具体目标接口的实现对象类型来拆分方法。具体如下。
 * 
 */
class SimpleStaticFactory {
	public Sender produceSms() {
		return new SmsSender();
	}
	
	public Sender produceEmail() {
		return new MailSender();
	}
}


/*======================================================================================================================================================================*/


/**
 * 静态工厂方法模式
 * 
 * 在多个工厂方法模式的基础上讲工厂的多个方法上加上static关键字使得工厂不必实例化就可以直接调用创建对象方法。
 * 
 */


class SimpleStaticFactory2 {
	public static Sender produceSms() {
		return new SmsSender();
	}
	
	public static Sender produceEmail() {
		return new MailSender();
	}
}









