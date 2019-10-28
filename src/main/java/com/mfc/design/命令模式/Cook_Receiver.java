package com.mfc.design.命令模式;

/**
 * @author MouFangCai
 * @date 2019/10/23 17:40
 *
 * @description  接收者(Receiver): 知道如何实施与执行一个请求相关的操作
 */
public class Cook_Receiver {

    // 做美食
    public void cookFood(String foodName){
        System.out.println("厨师开始做美食：" + foodName);
    }

    // 不做美食
    public void NotCookFood(String foodName){
        System.out.println("厨师不做美食：" + foodName);
    }
}
