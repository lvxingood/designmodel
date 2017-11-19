package com.lv.test.designmo.Prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * ԭ��ģʽ ԭ��ģʽ��ָ��ĳ����Ϊ�����ࡣ���ڴ�����и��ơ���¡�ͺʹ���һ���ͻ������Ƶ��¶��� ������ͨ�����������⡣ ��������ͨ��clone()��ʵ�ֵġ� ����ĸ��Ʒ�Ϊǳ���ƺ���� ǳ������ָ��һ�������ƺ󣬻����������͵ı����������´����������������͵ı�������ָ�������������͵ĵ�ַ
 * �����ָ��һ�������ƺ󣬳��˻����������͵ı����������´������������͵ı���Ҳ�����´����� ǳ���ƿ����ö����clone����ʵ�֡� ������ͨ����������ʵ��
 * 
 * @author lvxin
 */
public class PrototypeModel {
    public static void main(String[] args) throws CloneNotSupportedException, ClassNotFoundException, IOException {
        PrototypeObject po = new PrototypeObject();
        PrototypeObject po1 = (PrototypeObject)po.clone();
        PrototypeObject po2 = (PrototypeObject)po.deepclone();
        System.out.println(po.getUser());//�����������������Ϳ�����ʲô
        System.out.println(po1.getA());//ǳ���ƺ������������
        System.out.println(po1.getB());//ǳ���ƺ��ַ�������
        System.out.println(po1.getUser());//ǳ���ƺ��������������
        System.out.println(po2.getA());//��ƺ�Ļ�����������
        System.out.println(po2.getB());//��ƺ���ַ�������
        System.out.println(po2.getUser());//��ƺ��������������
        po.setA(2);//�޸Ļ���Ļ�����������
        po.setB("frv");//�޸Ļ�����ַ�������
        po.setUser(new User());//�޸Ļ����������������
        //����ȥ�۲�����޸ĺ�ı仯
        System.out.println(po1.getA());
        System.out.println(po1.getB());
        System.out.println(po1.getUser());
        System.out.println(po2.getA());
        System.out.println(po2.getB());
        System.out.println(po2.getUser());
        
        //�����۲췢�֣�ǳ���ƵĻ��������������ͺ��ַ������Ͷ��ǲ����ġ�
        //ǳ���ƴ�������ͻ�����������������ǻ���Ӱ���
        //��ƴ�������ͻ������������������û��Ӱ���
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
        // д�뵱ǰ��������
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(this);

        // ������������
        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        return (PrototypeObject) ois.readObject();
    }

}
