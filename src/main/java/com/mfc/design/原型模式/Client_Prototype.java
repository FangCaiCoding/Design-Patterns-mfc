package com.mfc.design.原型模式;

/**
 * @author MouFangCai
 * @date 2019/10/12 15:00
 */
public class Client_Prototype {

    public static void main(String[] args) {
        PrototypeCache.loadCache();

        Prototype clonedPrototype1 = (Prototype) PrototypeCache.getprototype("1");
        System.out.println("Prototype : " + clonedPrototype1.getType());

        Prototype clonedPrototype2 = (Prototype) PrototypeCache.getprototype("2");
        System.out.println("Prototype : " + clonedPrototype2.getType());
    }
}
