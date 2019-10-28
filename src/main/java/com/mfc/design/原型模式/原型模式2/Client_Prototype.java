package com.mfc.design.原型模式.原型模式2;

/**
 * @author MouFangCai
 * @date 2019/10/12 15:00
 */
public class Client_Prototype {

    public static void main(String[] args) throws CloneNotSupportedException {

        Person_Prototype p1 = new Person_Prototype("mfc");
        p1.setMessage(18, 22);

        // 复制一个新的Person,并修改对应的细节属性
        Person_Prototype p2 = (Person_Prototype)p1.clone();
        p2.setMessage(24,44 );

        System.out.println("是否是同一个对象：" + (p1 == p2));
        p1.dispaly();
        p2.dispaly();
    }
}
