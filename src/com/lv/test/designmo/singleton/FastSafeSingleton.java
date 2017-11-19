package com.lv.test.designmo.singleton;

/**
 * 该单例的写法，看上去是安全了。并且性能也能得到一定的保证。但是在一定几率的情况下会出现意想不到的问题，该问题是由于指令重排引起的。
 * 所谓指令重排就是在创建实例和赋值这个地方不是原子的。发生的先后顺序可能不是按照书写的顺序执行的。
 * @author lvxin
 *
 */
public class FastSafeSingleton {
    private static FastSafeSingleton singleton = null;
    
    private FastSafeSingleton() {
        
    }
    
    private static FastSafeSingleton getInstance() {
        if(null == singleton) {
            synchronized (singleton) {
                if (null == singleton) {
                    singleton = new FastSafeSingleton();
                }
            }
        }
        return singleton;
    }
}

