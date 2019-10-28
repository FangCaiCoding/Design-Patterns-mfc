package com.mfc.design.享元模式.实例;

/**
 * @author MouFangCai
 * @date 2019/10/25 14:48
 *
 * @description 具体的棋子：ConcreteFlyweight（具体享元类）：它实现了抽象享元类，其实例称为享元对象
 */
public class Chessman_ConcreteFlyweight extends Chessman_Flyweight{

    // 为内部状态增加存储空间
    // 棋子的内部属性：颜色
    private String color_intrinsic;

    // 要求享元角色 必须接受内部状态
    public Chessman_ConcreteFlyweight(String color_intrinsic) {
        this.color_intrinsic = color_intrinsic;
    }

    @Override
    public void display() {
        System.out.println("棋子颜色：" + color_intrinsic + "     在棋盒里");
    }

    @Override
    public void display(Coord_Extrinsic extrinsic) {
        System.out.println("棋子颜色：" + color_intrinsic +
                "      位置：(" + extrinsic.getX() + "," + extrinsic.getY() + ")");
    }
}
