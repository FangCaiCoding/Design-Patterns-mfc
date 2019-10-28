package com.mfc.design.装饰者模式;

/**
 * @author MouFangCai
 * @date 2019/10/11 16:47
 */
public class Client_Decorator {
    public static void main(String[] args) {

        //1、普通沙发
        ConcreteComponent_Sofa sofa1 = new ConcreteComponent_Sofa();
        System.out.println("普通沙发功能：");
        sofa1.show();
        System.out.println();

        //2、BedSofa
        ConcreteDecorator_Bedsofa bedsofa = new ConcreteDecorator_Bedsofa(sofa1);
        System.out.println("Bed沙发功能：");
        bedsofa.show();
        System.out.println();

        //3、HealthSofa
        ConcreteDecorator_Healthsofa healthsofa = new ConcreteDecorator_Healthsofa(sofa1);
        System.out.println("Health沙发的功能");
        healthsofa.show();
        System.out.println();


        //4、HealthSofa + BedSofa
        ConcreteDecorator_Healthsofa bed_healthsofa = new ConcreteDecorator_Healthsofa(bedsofa);
        System.out.println("Bed+Health沙发的功能");
        bed_healthsofa.show();
        System.out.println();
    }
}

