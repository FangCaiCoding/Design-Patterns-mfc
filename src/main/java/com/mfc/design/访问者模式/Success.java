package com.mfc.design.访问者模式;

/**
 * @author MouFangCai
 * @date 2019/10/28 16:14
 *
 * @description ConcreteVisitor（具体访问者）
 */
public class Success implements Action {
    @Override
    public void getManReact(Man concreteElementA) {
        System.out.println("男人成功时，背后都有一个伟大的女人");
    }

    @Override
    public void getWomanReact(Woman concreteElementB) {
        System.out.println("女人成功时，背后都有一群男人");
    }
}
