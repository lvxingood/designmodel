package com.lv.test.designmo.decorate;

/**
 * װ��ģʽ
 * װ������ͱ�װ���߶�ʵ��ͬһ���ӿ�
 * װ���໹Ҫ���б�װ���ߵ�һ������
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
        System.out.println("��װ����");
    }
}
