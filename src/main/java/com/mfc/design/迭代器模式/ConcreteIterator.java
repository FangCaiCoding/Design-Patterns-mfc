package com.mfc.design.迭代器模式;

/**
 * @author MouFangCai
 * @date 2019/10/21 15:37
 *
 * @description 具体的迭代器类
 */
public class ConcreteIterator extends Iterator{

    private ConcreteAggregate aggregate;
    private int current = 0;

    // 初始化聚集对象
    public ConcreteIterator(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public Object next() {
        Object result = null;
        if (current < aggregate.count()){
           result =  aggregate.getOne(current);
           current ++ ;
        }
        return result;
    }

    @Override
    public boolean hasNext() {
        return current < aggregate.count();
    }

}
