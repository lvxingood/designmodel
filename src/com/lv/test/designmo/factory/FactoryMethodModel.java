package com.lv.test.designmo.factory;

/**
 * ��������ģʽ
 * ��������ģʽ���������ģʽ�еĴ�����
 * ��������ģʽ�����֡��򵥹�������ģʽ�������������ģʽ����̬��������ģʽ
 * ��ν��������������ͨ������������������ʵ����˵���˾��Ƕ���һ����ר������ȥ����Ŀ����
 * @author lenovo
 *
 */
public class FactoryMethodModel {
	
	public static void main(String[] args) {
		FactoryMethodModel fmm = new FactoryMethodModel();
		//���Լ򵥹���ģʽ
		SimpleFactory  sf = new SimpleFactory();
		sf.produce("sms").send();
		sf.produce("email").send();
		
		//���Զ����������
		SimpleStaticFactory ssf = new SimpleStaticFactory();
		ssf.produceEmail().send();
		ssf.produceSms().send();
		
		//���Ծ�̬��������
		
		SimpleStaticFactory2.produceEmail().send();
		SimpleStaticFactory2.produceSms().send();
	}
    
}

/**
 * �򵥹�������ģʽ�ǳ��򵥡�
 * һ�������ࡣ�����ඨ����һ��������������Ŀ����󡣸÷�����һ��public���͵ķ���ֵΪĿ����ӿ����͡����ܻ��и���������������ĸ�����Ľӿ�ʵ���ࡣ
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
 *�����������ģʽ
 * �˷����ǻ��ڼ򵥹�������ģʽ���ĸĽ�
 * �򵥹�������ģʽ��Ҫ�ڵ��ù���������ʱ����һ��Ҫ���ɵľ���Ŀ��ӿڵ�ʵ�ֶ����ʵ����
 * �����Ļ������û����鲻�ã�������˵Ļ������������Ķ���������ɲ��ˡ�
 * ����������˱䶯�Ļ����������ifҪ���ű仯������Ļ��Ժ�ʵ����Խ��Խ�ࡣ����������Խ��Խ�������º���ά���Ƚ����ѡ�
 * ���Զ�������������ڼ�𹤳������Ļ����Ͻ��������ݾ���Ŀ��ӿڵ�ʵ�ֶ�����������ַ������������¡�
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
 * ��̬��������ģʽ
 * 
 * �ڶ����������ģʽ�Ļ����Ͻ������Ķ�������ϼ���static�ؼ���ʹ�ù�������ʵ�����Ϳ���ֱ�ӵ��ô������󷽷���
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









