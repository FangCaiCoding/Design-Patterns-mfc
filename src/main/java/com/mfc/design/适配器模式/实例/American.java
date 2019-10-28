package com.mfc.design.适配器模式.实例;

/**
 * @author MouFangCai
 * @date 2019/10/18 15:52
 *
 * 具体的目标类
 */
public class American extends Foreigner_Target {

    public American(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println( getName() + ": This is an American");
    }
}
