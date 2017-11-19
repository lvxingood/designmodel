package com.lv.test.designmo.singleton;

/**
 * volatile定义的关键字是可以避免指令重排
 * @author lvxin
 *
 */
public class FastAbsoluteSafeSingle {
    private static volatile FastAbsoluteSafeSingle singleton;
    
    private FastAbsoluteSafeSingle() {
        
    }
    
    private static FastAbsoluteSafeSingle getInstance() {
        if(null == singleton) {
            synchronized (singleton) {
                if (null == singleton) {
                    singleton = new FastAbsoluteSafeSingle();
                }
            }
        }
        return singleton;
    }
    
}

