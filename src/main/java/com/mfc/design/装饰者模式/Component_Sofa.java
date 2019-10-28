package com.mfc.design.装饰者模式;

/**
 * @author MouFangCai
 * @date 2019/10/11 16:45
 */
//抽象构件（Component）角色
public interface Component_Sofa {
    //测试方法，用以展示沙发所具有的功能
    void show();
    //坐
    void sit();
    //躺
    void lie();
}

