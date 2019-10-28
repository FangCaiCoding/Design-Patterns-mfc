package com.mfc.design.享元模式.实例;

/**
 * @author MouFangCai
 * @date 2019/10/25 14:58
 * @description UnsharedConcreteFlyweight（非共享具体享元类）
 * 坏了的棋子就不管他的颜色了
 */
public class UnsharedConcreteFlyweight extends Chessman_Flyweight {
    @Override
    public void display() {
        System.out.println("这个棋子已坏");
    }

    @Override
    public void display(Coord_Extrinsic extrinsic) {
        System.out.println("这个棋子已坏");
    }
}
