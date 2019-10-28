package com.mfc.design.原型模式;

/**
 * @author MouFangCai
 * @date 2019/10/12 14:45
 */
public class ConcretePrototypeA extends Prototype {
    @Override
    void draw() {
        System.out.println("这是ConcretePrototypeA的draw()");
    }
    public ConcretePrototypeA(){
        type = "ConcretePrototypeA";
    }
}
