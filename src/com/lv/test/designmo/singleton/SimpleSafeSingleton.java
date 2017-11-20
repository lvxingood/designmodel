package com.lv.test.designmo.singleton;

/**
 * �õ�����д���ǻ��ڼ򵥵���д������getInstance�����ϼ���ͬ��������֤���̰߳�ȫ������ÿ��get�����ʱ��Ҫȥ���������ܺܲ�
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
