package com.mfc.design.迭代器模式;

import java.util.*;
import java.util.Iterator;

/**
 * @author MouFangCai
 * @date 2019/10/21 15:20
 *
 * @description
 */
public class Client_Iterator {

    public static void main(String[] args) {

        List<String> items = new ArrayList<>();
        for (int i = 1; i < 5; i++) {
            items.add("成员-" + i);
        }
        // 创建一个聚集对象
        ConcreteAggregate<String> concreteAggregate = new ConcreteAggregate();
        concreteAggregate.setItems(items);

        // 迭代器遍历
        ConcreteIterator iterator = new ConcreteIterator(concreteAggregate);
        while (iterator.hasNext()){
            System.out.println("遍历----" + iterator.next().toString());
        }
    }
}
