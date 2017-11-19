package com.lv.test.designmo.singleton;

/**
 * �õ�����д��������ȥ�ǰ�ȫ�ˡ���������Ҳ�ܵõ�һ���ı�֤��������һ�����ʵ�����»�������벻�������⣬������������ָ����������ġ�
 * ��νָ�����ž����ڴ���ʵ���͸�ֵ����ط�����ԭ�ӵġ��������Ⱥ�˳����ܲ��ǰ�����д��˳��ִ�еġ�
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

