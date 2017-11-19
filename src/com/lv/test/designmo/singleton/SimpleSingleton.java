package com.lv.test.designmo.singleton;

/**
 * �õ�����д������򵥵ġ�û�п��Ƕ��̲߳���������µ����̰߳�ȫ���⡣
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
