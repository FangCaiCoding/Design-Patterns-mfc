package com.mfc.design.状态模式;

/**
 * @author MouFangCai
 * @date 2019/10/17 15:42
 */
public class ConcreteStateB implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("stateB处理完成，转到下一个状态");
        context.setState(new ConcreteStateA());
    }
    
}
