package com.lv.test.designmo.singleton;

public class SimpleSingleton {
	
	public static void main(String[] args) {
		Singleton.getInstance();
	}
}

class Singleton {
    private static Singleton singleton = null;
    
    private Singleton() {
    	
    }
    
    public static  Singleton getInstance() {
    	if (null == singleton) {
    		singleton =  new Singleton();
    	}
    	return singleton;
    }
}

class Singleton2 {
    private static Singleton2 singleton2 = null;
    
    private Singleton2() {
    	
    }
    
    /**
     * ����Ϊ������˸�synchronized�Ͱ�ȫ��ô������ȷʵ�ǰ�ȫ�ˡ��������ܼ��͡���ס�������������������������ʱ��������������Һ����ȡ�����ʱ��Ҫ������
     * @return
     */
    public static synchronized Singleton2 getInstance() {
    	if (null == singleton2) {
    		singleton2 =  new Singleton2();
    	}
    	return singleton2;
    }
}


class Singleton3 {
    private static Singleton3 singleton3 = null;
    
    private Singleton3() {
    	
    }
    
    /**
     * ����Ϊ������˸�synchronized�Ͱ�ȫ��ô������ȷʵ�ǰ�ȫ�ˡ��������ܼ��͡���ס�������������������������ʱ��������������Һ����ȡ�����ʱ��Ҫ������
     * @return
     */
    public static synchronized Singleton3 getInstance() {
    	if (null == singleton3) {
    		synchronized (singleton3) {
    			if (null == singleton3) {
    				singleton3 =  new Singleton3();
    			}
			}
    	}
    	return singleton3;
    }
}
