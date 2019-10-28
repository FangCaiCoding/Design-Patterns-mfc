package com.mfc.design.原型模式.原型模式2;

/**
 * @author MouFangCai
 * @date 2019/10/12 16:25
 */
public class ConcretePerson1 extends Person_Prototype {
    public ConcretePerson1(String name) {
        super(name);
        setMessage(11, 22);
    }


}
