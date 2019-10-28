package com.mfc.design.适配器模式.实例;

/**
 * @author MouFangCai
 * @date 2019/10/18 16:01
 *
 * Adaptee（适配者类）:适配者即被适配的角色
 */
public class Chinese_Adaptee {

    private String name;

    public Chinese_Adaptee(String name) {
        this.name = name;
    }

    public void 说话(){
        System.out.println( name + ": 这是一个美国人");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
