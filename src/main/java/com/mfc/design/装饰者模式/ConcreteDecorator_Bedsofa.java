package com.mfc.design.装饰者模式;

/**
 * @author MouFangCai
 * @date 2019/10/11 16:45
 */

/**
 * 具体装饰（Concrete Decorator）角色：负责给构件对象添加上新功能。
 */
public class ConcreteDecorator_Bedsofa extends Decorator_Sofa {

    public ConcreteDecorator_Bedsofa(Component_Sofa componentSofa) {
        super(componentSofa);
    }
    @Override
    public void show(){
        // 先执行原component的方法，再执行本类的功能
        super.show();
        this.add();
    }
    void add(){
        System.out.println("可以睡觉");
    }

}

