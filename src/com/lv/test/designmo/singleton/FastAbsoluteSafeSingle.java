package com.lv.test.designmo.singleton;

/**
 * volatile����Ĺؼ����ǿ��Ա���ָ������
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

