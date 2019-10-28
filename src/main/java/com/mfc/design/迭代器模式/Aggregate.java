package com.mfc.design.迭代器模式;

/**
 * @author MouFangCai
 * @date 2019/10/21 15:36
 *
 * @description 聚合抽象类
 */
public abstract class Aggregate {

    // 创建迭代器
    public abstract Iterator createIterator();
}
