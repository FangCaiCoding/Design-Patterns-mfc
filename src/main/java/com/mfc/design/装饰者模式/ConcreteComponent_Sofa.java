package com.mfc.design.装饰者模式;

/**
 * @author MouFangCai
 * @date 2019/10/11 16:45
 */

/**
 * 再定义一个Sofa接口的实现类，扮演装饰模式中的
 *  具体构件（Concrete Component）角色
 */
public class ConcreteComponent_Sofa implements Component_Sofa {
    @Override
    public void show() {
        this.sit();
        this.lie();
    }

    @Override
    public void sit() {
        System.out.println("可以坐");
    }

    @Override
    public void lie() {
        System.out.println("可以躺");
    }
}

