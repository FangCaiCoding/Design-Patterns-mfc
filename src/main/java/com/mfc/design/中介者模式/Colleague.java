package com.mfc.design.中介者模式;

/**
 * @author MouFangCai
 * @date 2019/10/24 17:22
 * @description 链家的顾客：抽象同事类（Colleague）角色
 */
public abstract class Colleague {

    protected Mediator mediator;

    // 得到中介者对象
    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}
