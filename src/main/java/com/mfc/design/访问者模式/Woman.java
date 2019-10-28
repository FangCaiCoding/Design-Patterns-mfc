package com.mfc.design.访问者模式;

/**
 * @author MouFangCai
 * @date 2019/10/28 16:11
 *
 * @description ConcreteElement（具体元素）
 */
public class Woman extends Person {

    @Override
    void accept(Action visitor) {

        visitor.getWomanReact(this);
    }
}
