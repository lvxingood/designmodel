package com.lv.test.designmo.adapter;

/**
 * �������
 * ��һ��Source�࣬ӵ��һ�������������䣬Ŀ��ӿ���Targetable��ͨ��Adapter�࣬��Source�Ĺ�����չ��Targetable��
 * @author lvxin
 *
 */
public class ClassAdapte {
    public static void main(String[] args) {
        AdapteObject ao = new AdapteObject();
        
        ao.method1();
        ao.method2();
    }
}

interface TargetAble {
    public void method2 ();
}

class Source {
    public void method1 () {
        System.out.println("SOURCE METHOD");
    }
}

class AdapteObject extends Source implements TargetAble {
    @Override
    public void method2() {
        System.out.println("����ķ���");
    }
}