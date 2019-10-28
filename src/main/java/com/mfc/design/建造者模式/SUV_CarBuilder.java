package com.mfc.design.建造者模式;

/**
 * @author MouFangCai
 * @date 2019/10/14 20:05
 */
public class SUV_CarBuilder extends Builder {
    private Product_Car suvCar = new Product_Car();
    @Override
    void buildColour() {
       suvCar.setColour("红色");
    }

    @Override
    void buildType() {
        suvCar.setType("suv");
    }

    @Override
    void buildSize() {
        suvCar.setSize(5);
    }

    @Override
    Product_Car createCar() {
        return suvCar;
    }
}
