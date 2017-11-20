package com.lv.test.designmo.singleton;

/**
 * 该单例的写法是基于简单单例写法。在getInstance方法上加了同步处理。保证了线程安全。但是每次get对象的时候都要去竞争，性能很差
 *
 * @author lvxin
 *
 */
public class SimpleSafeSingleton {
    private static SimpleSafeSingleton singleton = null;
    
    private SimpleSafeSingleton() {
        
    }
    
    private static synchronized SimpleSafeSingleton getInstance() {
        if (null == singleton) {
            singleton = new SimpleSafeSingleton();
        }
        return singleton;
    }
    
}
