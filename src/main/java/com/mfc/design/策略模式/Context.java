package com.mfc.design.策略模式;

/**
 * @author MouFangCai
 * @date 2019/10/11 11:32
 */
public class Context {

    Strategy strategy;

    public Context (Strategy strategy) {
        // 初始化时，传入具体的策略对象
        this.strategy = strategy;
    }

    // 上下文接口
    public void ContextInterface() {
        // 根据具体的策略对象，调用就其算法的方法
        strategy.algorithmInterface();
    }
}
