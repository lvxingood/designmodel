package com.lv.test.designmo.Prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 原型模式 原型模式是指以某个类为基础类。基于此类进行复制、克隆和和创建一个和基类类似的新对象 本例是通过复制来讲解。 复制类是通过clone()来实现的。 对象的复制分为浅复制和深复制 浅复制是指将一个对象复制后，基本数据类型的变量都会重新创建，但是引用类型的变量还会指向基类的引用类型的地址
 * 深复制是指将一个对象复制后，除了基本数据类型的变量都会重新创建，引用类型的变量也会重新创建。 浅复制可以用对象的clone方法实现。 神复制是通过二进制流实现
 * 
 * @author lvxin
 */
public class PrototypeModel {
    public static void main(String[] args) throws CloneNotSupportedException, ClassNotFoundException, IOException {
        PrototypeObject po = new PrototypeObject();
        PrototypeObject po1 = (PrototypeObject)po.clone();
        PrototypeObject po2 = (PrototypeObject)po.deepclone();
        System.out.println(po.getUser());//先输出基类的引用类型看看是什么
        System.out.println(po1.getA());//浅复制后基础数据类型
        System.out.println(po1.getB());//浅复制后字符串类型
        System.out.println(po1.getUser());//浅复制后的引用数据类型
        System.out.println(po2.getA());//深复制后的基础数据类型
        System.out.println(po2.getB());//深复制后的字符串类型
        System.out.println(po2.getUser());//深复制后的引用数据类型
        po.setA(2);//修改基类的基础数据类型
        po.setB("frv");//修改基类的字符串类型
        po.setUser(new User());//修改基类的引用数据类型
        //下面去观察基类修改后的变化
        System.out.println(po1.getA());
        System.out.println(po1.getB());
        System.out.println(po1.getUser());
        System.out.println(po2.getA());
        System.out.println(po2.getB());
        System.out.println(po2.getUser());
        
        //经过观察发现，浅复制的话，基础数据类型和字符串类型都是不会变的。
        //浅复制创建的类和基类的引用数据类型是互相影响的
        //深复制创建的类和基类的引用数据类型是没有影响的
    }
}

class User implements Serializable{

}

class PrototypeObject implements Cloneable, Serializable {

    private int a=1;

    private String b="abc";

    private User user = new User();

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Object clone() throws CloneNotSupportedException {
        return (PrototypeObject) super.clone();
    }

    public Object deepclone() throws IOException, ClassNotFoundException {
        // 写入当前二进制流
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(this);

        // 读出二进制流
        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        return (PrototypeObject) ois.readObject();
    }

}
