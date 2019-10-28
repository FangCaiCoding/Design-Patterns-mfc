package com.mfc.design.适配器模式.实例;

/**
 * @author MouFangCai
 * @date 2019/10/18 15:48
 *
 * Target（目标抽象类）：目标抽象类定义客户所需接口
 */
public abstract class Foreigner_Target {

    private String name;

    public Foreigner_Target(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void speak();
}
