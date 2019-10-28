package com.mfc.design.建造者模式;

/**
 * @author MouFangCai
 * @date 2019/10/14 20:09
 */
public class Director {


    public void construct(Builder builder){
        builder.buildColour();
        builder.buildSize();
        builder.buildType();
    }
}
