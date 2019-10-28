package com.mfc.design.访问者模式;

/**
 * @author MouFangCai
 * @date 2019/10/28 16:06
 *
 * @description Element（抽象元素）
 */
public abstract class Person {
    // 用来获得“行为”对象的
   abstract void accept(Action visitor);
}
