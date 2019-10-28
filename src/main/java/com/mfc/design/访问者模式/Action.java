package com.mfc.design.访问者模式;

/**
 * @author MouFangCai
 * @date 2019/10/28 16:07
 *
 * @description Visitor（抽象访问者）
 */
public interface Action {
    // 得到Man的反应
    void getManReact(Man concreteElementA);
    // 得到Woman的反应
    void getWomanReact(Woman concreteElementB);
}
