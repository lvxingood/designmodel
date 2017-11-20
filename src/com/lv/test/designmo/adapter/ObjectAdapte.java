package com.lv.test.designmo.adapter;

/**
 * ��������䡣
 * ��ν�������������Ĺ�ϵ���档ͨ���̳и���ķ�ʽ�ﵽӵ�и��������İ취��
 * �൱��ͨ���̳и����ʵ��Ŀ��ӿڴﵽ�����Ч�����԰����ߵĹ��ܶ�������
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
