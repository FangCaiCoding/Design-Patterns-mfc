package com.mfc.design.享元模式.实例;


/**
 * @author MouFangCai
 * @date 2019/10/25 15:01
 * @description
 */
public class Client_Flyweight {
    public static void main(String[] args) {

        // 获取享元工厂对象
        Chessman_Factory factory = Chessman_Factory.getFactory();
        // 获取2枚黑棋、2枚白棋、2枚坏了的棋子
        Chessman_Flyweight black1 = factory.getFlyweight("b");
        Chessman_Flyweight black2 = factory.getFlyweight("b");
        System.out.println("判断黑棋是否相同:" + (black1 == black2));

        Chessman_Flyweight white1 = factory.getFlyweight("w");
        Chessman_Flyweight white2 = factory.getFlyweight("w");
        System.out.println("判断白棋是否相同:" + (white1 == white2));

        Chessman_Flyweight bad1 = factory.getFlyweight("no");
        Chessman_Flyweight bad2 = factory.getFlyweight("no");
        System.out.println("判断坏了的棋子是否相同:" + (bad1 == bad2));
        System.out.println();
        System.out.println("棋子的实例数：" + factory.getCount());
        System.out.println();
        // 显示棋子
        black1.display();
        white1.display();
        bad1.display();

        // 显示棋子,同时设置坐标位置
        System.out.println();
        black2.display(new Coord_Extrinsic(1,2));
        white2.display(new Coord_Extrinsic(2,3));
        bad2.display(new Coord_Extrinsic(1,2));
    }
}
