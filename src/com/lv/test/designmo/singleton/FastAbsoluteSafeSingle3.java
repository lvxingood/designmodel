package com.lv.test.designmo.singleton;

/**
 * volatile����Ĺؼ����ǿ��Ա���ָ������
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

