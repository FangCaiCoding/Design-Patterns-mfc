package com.mfc.design.原型模式.原型模式2;

/**
 * @author MouFangCai
 * @date 2019/10/12 16:12
 */
// 原型Prototype
public class Person_Prototype implements Cloneable {

    private String name;
    private int age;
    private int score;

    // 设置需要复制的属性(公有属性)
    public Person_Prototype(String name){
        this.name = name;
    }

    // 设置需要自定义的属性
    public void setMessage(int age, int score){
        this.age =age;
        this.score =score;
    }

    public void dispaly(){
        System.out.println("name：" + name + "----age:"+ age + "----score:" + score);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
