package com.mfc.design.迭代器模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @author MouFangCai
 * @date 2019/10/21 15:38
 *
 * @description 具体的聚集类
 */
public class ConcreteAggregate<T> extends Aggregate {

    // 存放集合对象
    private List<T> items = new ArrayList<>();

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    public int count(){
        return items.size();
    }

    public T getOne(int index){
        return items.get(index);
    }

    public void setItems(List<T> items) {
        this.items = items;
    }
}
