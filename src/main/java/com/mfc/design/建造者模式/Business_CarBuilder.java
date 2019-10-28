package com.mfc.design.建造者模式;

/**
 * @author MouFangCai
 * @date 2019/10/14 20:05
 */
public class Business_CarBuilder extends Builder {
    private Product_Car businessCar = new Product_Car();
    @Override
    void buildColour() {
        businessCar.setColour("黑色");
    }

    @Override
    void buildType() {
        businessCar.setType("business");
    }

    @Override
    void buildSize() {
        businessCar.setSize(7);
    }

    @Override
    Product_Car createCar() {
        return businessCar;
    }
}
