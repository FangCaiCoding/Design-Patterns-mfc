package com.mfc.design.访问者模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @author MouFangCai
 * @date 2019/10/28 16:20
 *
 * @description ObjectStructure（对象结构）：对象结构是一个元素的集合
 */
public class PersonList {
    private List<Person> list = new ArrayList<>();

    public void add(Person element) {
        list.add(element);
    }

    public void delete(Person element) {
        list.remove(element);
    }
    // 查看显示
    public void display(Action visitor) {
        for (Person p : list) {
            p.accept(visitor);
        }
    }
}
