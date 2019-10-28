package com.mfc.design.建造者模式;

/**
 * @author MouFangCai
 * @date 2019/10/14 20:12
 */
public class Client_Builder {

    public static void main(String[] args) {
        Director director = new Director();
        Builder suvCarBuilder = new SUV_CarBuilder();
        director.construct(suvCarBuilder);
        Product_Car suv = suvCarBuilder.createCar();
        System.out.println(suv.toString());

        Builder business_carBuilder = new Business_CarBuilder();
        director.construct(business_carBuilder);
        Product_Car builderCar = business_carBuilder.createCar();
        System.out.println(builderCar.toString());

    }

}
