package com.lv.test.designmo.adapter;

public class InterfaceAdapter {
    public static void main(String[] args) {
        AbstractInter ai1 = new SubClass1();
        AbstractInter ai2 = new SubClass2();
        ai1.method1();
        ai1.method2();
        ai2.method1();
        ai2.method2();
    }
}

interface TargetAble1 {
    public void method1();

    public void method2();
}

abstract class AbstractInter implements TargetAble1 {
    public void method1() {

    }

    public void method2() {

    }
}

class SubClass1 extends AbstractInter {
    public void method1() {
        System.out.println("method1...");
    }
}

class SubClass2 extends AbstractInter {
    public void method2() {
        System.out.println("method2...");
    }
}