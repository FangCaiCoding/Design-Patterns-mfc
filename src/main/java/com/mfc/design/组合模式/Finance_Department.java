package com.mfc.design.组合模式;

/**
 * @author MouFangCai
 * @date 2019/10/19 17:16
 */
public class Finance_Department extends Company {
    public Finance_Department(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {

    }

    @Override
    public void remove(Company company) {

    }

    @Override
    public void display(int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("-");
        }
        System.out.println(getName());
    }

    @Override
    public void lineOfDuty() {
        System.out.println(getName() + ":负责财务结算");
    }
}
