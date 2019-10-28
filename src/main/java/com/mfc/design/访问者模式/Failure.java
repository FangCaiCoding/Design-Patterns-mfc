package com.mfc.design.访问者模式;

/**
 * @author MouFangCai
 * @date 2019/10/28 16:14
 *
 * @description ConcreteVisitor（具体访问者）
 */
public class Failure implements Action {
    @Override
    public void getManReact(Man concreteElementA) {
        System.out.println("男人失败时，闷头喝酒，谁也不用劝");
    }

    @Override
    public void getWomanReact(Woman concreteElementB) {
        System.out.println("女人失败时，眼泪汪汪，谁也劝不了");
    }
}
