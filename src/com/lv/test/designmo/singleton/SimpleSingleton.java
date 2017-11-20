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
     * 你以为这里加了个synchronized就安全了么。不错确实是安全了。但是性能极低。锁住了整个方法。不仅创建对象的时候加锁竞争。而且后面获取对象的时候都要竞争。
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
     * 你以为这里加了个synchronized就安全了么。不错确实是安全了。但是性能极低。锁住了整个方法。不仅创建对象的时候加锁竞争。而且后面获取对象的时候都要竞争。
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
