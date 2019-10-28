package com.mfc.design.组合模式;

/**
 * @author MouFangCai
 * @date 2019/10/19 16:40
 *
 * Component：组合中的对象申明接口
 */
public abstract class Company {

    private String name;

    public Company(String name) {
        this.name = name;
    }

    public abstract void add(Company company);
    public abstract void remove(Company company);
    public abstract void display(int depth);

    // “履行职责”方法，不同的部门需要履行不同的职责
    public abstract void lineOfDuty();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
