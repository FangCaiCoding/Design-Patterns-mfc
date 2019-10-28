package com.mfc.design.建造者模式;

/**
 * @author MouFangCai
 * @date 2019/10/14 20:04
 */
public  abstract class Builder {

    abstract void buildColour();
    abstract void buildType();
    abstract void buildSize();
    abstract Product_Car createCar();
}
