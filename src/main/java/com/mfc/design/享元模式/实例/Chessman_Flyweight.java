package com.mfc.design.享元模式.实例;

/**
 * @author MouFangCai
 * @date 2019/10/25 14:29
 *
 * @description 五子棋棋子类：Flyweight（抽象享元类）
 */
public abstract class Chessman_Flyweight {

    public abstract void display();
    // 通过该接口，Flyweight可以接受并作用于外部状态
    public abstract void display(Coord_Extrinsic extrinsic);
}
