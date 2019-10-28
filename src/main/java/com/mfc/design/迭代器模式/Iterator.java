package com.mfc.design.迭代器模式;

/**
 * @author MouFangCai
 * @date 2019/10/21 15:23
 *
 * @description 迭代器抽象类
 */
public abstract class Iterator {

    public abstract Object next();
    public abstract boolean hasNext();
}
