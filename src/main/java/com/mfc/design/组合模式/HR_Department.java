package com.mfc.design.组合模式;

/**
 * @author MouFangCai
 * @date 2019/10/19 17:06
 *
 * Leaf：在组合中表示叶节点对象，叶节点没有子节点
 */
public class HR_Department extends Company {

    public HR_Department(String name) {
        super(name);
    }

    // 由于“叶子”没有再增加分支和树叶的能力，所以add()和remove()实现是没有意义的
    @Override
    public void add(Company company) {

    }

    @Override
    public void remove(Company company) {

    }

    // 展示具体的名称和级别
    @Override
    public void display(int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("-");
        }
        System.out.println(getName());
    }

    @Override
    public void lineOfDuty() {
        System.out.println(getName() + ": 负责招聘");
    }
}
