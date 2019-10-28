package com.mfc.design.访问者模式;

/**
 * @author MouFangCai
 * @date 2019/10/28 16:23
 * @description
 */
public class Client_visitor {
    public static void main(String[] args) {
        PersonList persons = new PersonList();
        persons.add(new Man());
        persons.add(new Woman());

        // 成功时
        Success s = new Success();
        persons.display(s);

        // 失败时
        Failure f = new Failure();
        persons.display(f);
    }
}
