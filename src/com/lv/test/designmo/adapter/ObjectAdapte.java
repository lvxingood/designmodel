package com.lv.test.designmo.adapter;

/**
 * 对象的适配。
 * 所谓类的适配是在类的关系层面。通过继承父类的方式达到拥有父类能力的办法。
 * 相当于通过继承父类和实现目标接口达到适配的效果可以把两者的功能都加起来
 * @author lvxin
 *
 */
public class ObjectAdapte {
    public static void main(String[] args) {
        Source source = new Source();
        
        AdapteObject1 ao1 = new AdapteObject1(source);
        
        ao1.method1();
        ao1.method2();
    }
}

class AdapteObject1 implements TargetAble{
    private Source source;
    
    public AdapteObject1(Source source) {
        this.source = source;
    }
    
    public void method1() {
        source.method1();
    }
    
    @Override
    public void method2() {
        System.out.println("tartget object");        
    }
}
