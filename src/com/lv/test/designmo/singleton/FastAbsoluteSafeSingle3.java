package com.lv.test.designmo.singleton;

/**
 * volatile定义的关键字是可以避免指令重排
 * @author lvxin
 *
 */
public class FastAbsoluteSafeSingle3 {
    private static volatile FastAbsoluteSafeSingle3 singleton;
    
    private FastAbsoluteSafeSingle3() {
        
    }
    
    private static synchronized void createSingleton() {
        if (null == singleton) {
            singleton = new FastAbsoluteSafeSingle3();
        }
    }
    
    private static FastAbsoluteSafeSingle3 getInstance() {
        if(null == singleton) {
            createSingleton();
        }
        return singleton;
    }
    
}

