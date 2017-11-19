package com.lv.test.designmo.singleton;

/**
 * 该单例的写法是最简单的。没有考虑多线程并发的情况下的现线程安全问题。
 * @author lvxin
 *
 */
public class SimpleSingleton {
    private static SimpleSingleton singleton;
    
    private SimpleSingleton () {
        
    }
    
    private static SimpleSingleton getInstance() {
        if (null == singleton) {
            singleton = new SimpleSingleton();
        }
        return singleton;
    } 
    
}
