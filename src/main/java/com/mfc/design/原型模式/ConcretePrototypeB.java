package com.mfc.design.原型模式;

/**
 * @author MouFangCai
 * @date 2019/10/12 14:45
 */
public class ConcretePrototypeB extends Prototype {
    @Override
    void draw() {
        System.out.println("这是ConcretePrototypeB的draw()");
    }
    public ConcretePrototypeB(){
        type = "ConcretePrototypeB";
    }

}
