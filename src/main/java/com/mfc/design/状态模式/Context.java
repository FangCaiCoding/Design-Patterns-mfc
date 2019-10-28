package com.mfc.design.状态模式;

/**
 * @author MouFangCai
 * @date 2019/10/17 15:37
 *
 * Context 维护一个ConcreteState子类的实例
 */
public class Context {

    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    // 对请求做处理，并设置下一个状态
    public void doAction(){
        state.doAction(this);
    }
}
