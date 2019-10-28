package com.mfc.design.状态模式;

/**
 * @author MouFangCai
 * @date 2019/10/17 15:58
 */
public class Client_State {

    public static void main(String[] args) {
        Context context = new Context();
        // 设置context的初始状态为 ConcreteStateA
        context.setState(new ConcreteStateA());

        // 不断的请求，同时更改状态
        context.doAction();

        context.doAction();



    }
}
