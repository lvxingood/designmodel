package com.lv.test.designmo.decorate;

/**
 * 装饰模式
 * 装饰这类和被装饰者都实现同一个接口
 * 装饰类还要持有被装饰者的一个对象
 * @author lvxin
 *
 */
public class DecorateModel {

}

interface SourceAble3 {
    public void method();
}
class SourceObject implements SourceAble3{
    @Override
    public void method() {
        System.out.println("被装饰者");
    }
}
