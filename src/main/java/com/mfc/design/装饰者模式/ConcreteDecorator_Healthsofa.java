package com.mfc.design.装饰者模式;

/**
 * @author MouFangCai
 * @date 2019/10/11 16:45
 */
public class ConcreteDecorator_Healthsofa extends Decorator_Sofa {
    public ConcreteDecorator_Healthsofa(Component_Sofa sofa) {
        super(sofa);
    }

    @Override
    public void show() {
        super.show();
        this.add();
    }
    void add(){
        System.out.println("可以按摩");
    }
}


