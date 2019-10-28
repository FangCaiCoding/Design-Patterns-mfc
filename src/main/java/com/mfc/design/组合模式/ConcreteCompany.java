package com.mfc.design.组合模式;


import java.util.ArrayList;
import java.util.List;

/**
 * @author MouFangCai
 * @date 2019/10/19 16:46
 *
 * Composite：定义有支节点行为，用来存储子部件
 */
public class ConcreteCompany extends Company {

    private List<Company> childrens = new ArrayList<>();

    public ConcreteCompany(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {
        childrens.add(company);
    }

    @Override
    public void remove(Company company) {
        childrens.remove(company);
    }

    // 层级展示
    @Override
    public void display(int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("-");
        }
        System.out.println(getName());

        for (Company c : childrens) {
            c.display(depth + 2);
        }
    }

    // 部门职责
    @Override
    public void lineOfDuty() {
        for (Company c : childrens) {
            c.lineOfDuty();
        }
    }
}
