package com.lv.test.designmo.singleton;

/**
 * volatile����Ĺؼ����ǿ��Ա���ָ������
 * @author lvxin
 *
 */
public class FastAbsoluteSafeSingle2 {
    
    private FastAbsoluteSafeSingle2() {
        
    }
    
    private static class SingleFactory {
        private static FastAbsoluteSafeSingle2 singleton  = new FastAbsoluteSafeSingle2();
    }
    
    private static FastAbsoluteSafeSingle2 getInstance() {
        return SingleFactory.singleton;
    }
    
}

