package com.mfc.design.状态模式;

/**
 * @author MouFangCai
 * @date 2019/10/17 15:42
 *
 * 具体状态类，每一个子类实现一个与context的一个状态相关的行为
 */
public class ConcreteStateA implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("stateA处理完成，转到下一个状态");
        context.setState(new ConcreteStateB());
    }

}
