package com.mfc.design.策略模式;

/**
 * @author MouFangCai
 * @date 2019/10/11 11:32
 */
public class Context_Factory {


    Strategy strategy = null;

    public Context_Factory(String options) {
        // 初始化时，根据客户端不同的选择，实例化具体的策略对象
        switch (options){
            case "A":
                strategy = new ConcreteStrategyA();
                break;
            case "B":
                strategy = new ConcreteStrategyB();
                break;
            case "C":
                strategy = new ConcreteStrategyC();
                break;
        }
    }

    // 上下文接口
    public void ContextInterface() {
        // 根据具体的策略对象，调用就其算法的方法
        strategy.algorithmInterface();
    }

    public static void main(String[] args) {

    }

}
