package com.lv.test.designmo.adapter;

/**
 * 类的适配
 * 有一个Source类，拥有一个方法，待适配，目标接口是Targetable，通过Adapter类，将Source的功能扩展到Targetable里
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
        System.out.println("适配的方法");
    }
}