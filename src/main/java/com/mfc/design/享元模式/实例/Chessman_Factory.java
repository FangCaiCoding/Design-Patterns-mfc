package com.mfc.design.享元模式.实例;

import java.util.HashMap;

/**
 * @author MouFangCai
 * @date 2019/10/25 15:01
 * @description FlyweightFactory（享元工厂类）：享元工厂类用于创建并管理享元对象
 */
public class Chessman_Factory {
    // 使用HashMap存储享元对象，充当享元池
    private static HashMap<String,Chessman_Flyweight> chessmanMaps;

    // 使用单例模式，保证Chessman_Factory 类只有一个实例
    private static class FactoryClass {
        private static final Chessman_Factory chessman = new Chessman_Factory();
    }

    // 初始化常用的棋子
    private Chessman_Factory() {
        chessmanMaps = new HashMap<>();
        Chessman_Flyweight white = new Chessman_ConcreteFlyweight("白色");
        chessmanMaps.put("w",white);
        Chessman_Flyweight black = new Chessman_ConcreteFlyweight("黑色");
        chessmanMaps.put("b",black);
        Chessman_Flyweight unshared = new UnsharedConcreteFlyweight();
        chessmanMaps.put("no",unshared);
    }
    // 得到 享元工厂类的唯一实例
    public static Chessman_Factory getFactory() {
        return FactoryClass.chessman;
    }

    public  Chessman_Flyweight getFlyweight(String color){
        return chessmanMaps.get(color);
    }

    // 实例数
    public int getCount(){
        return chessmanMaps.size();
    }


}
