package com.mfc.design.装饰者模式;

/**
 * @author MouFangCai
 * @date 2019/10/11 16:45
 */
/**
 * 再定义一个装饰（Decorator）角色
 * 持有一个构件（Component）对象的实例，
 * 并实现一个与抽象构件接口一致的接口
 */
public class Decorator_Sofa implements Component_Sofa {
    //私有的构件对象
    private Component_Sofa sofa;

    public Decorator_Sofa(Component_Sofa sofa) {
        this.sofa = sofa;
    }
    @Override
    public void show() {
        // 委派给具体构件
        sofa.show();
    }

    @Override
    public void sit() {
        // 委派给具体构件
        sofa.sit();
    }

    @Override
    public void lie() {
        // 委派给具体构件
        sofa.lie();
    }
}

