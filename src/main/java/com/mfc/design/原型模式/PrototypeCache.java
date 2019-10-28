package com.mfc.design.原型模式;

import java.util.Hashtable;

/**
 * @author MouFangCai
 * @date 2019/10/12 14:45
 */
public class PrototypeCache {

    // 维护一个注册表
    private static Hashtable<String, Prototype> prototypeMap = new Hashtable<>();

    // 提供一个获取新实例的方法
    public static Prototype getprototype(String prototypeId) {
        Prototype cached = prototypeMap.get(prototypeId);
        return (Prototype) cached.clone();
    }

    // 对每种形状都运行数据库查询，并创建该形状
    // prototypeMap.put(prototypeId, Prototype);
    // 例如，我们要添加2种Prototype
    public static void loadCache() {
        ConcretePrototypeA A = new ConcretePrototypeA();
        A.setId("1");
        prototypeMap.put(A.getId(),A);

        ConcretePrototypeB B = new ConcretePrototypeB();
        B.setId("2");
        prototypeMap.put(B.getId(),B);
    }
}