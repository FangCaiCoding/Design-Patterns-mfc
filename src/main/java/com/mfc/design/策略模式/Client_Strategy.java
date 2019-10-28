package com.mfc.design.策略模式;

/**
 * @author MouFangCai
 * @date 2019/10/11 11:36
 */
public class Client_Strategy {


    public static void main(String[] args) {
        doStrategy("A");
        doStrategy("B");
        doStrategy("C");
    }

    public static void doStrategy(String options){
        Context context = null;
        switch (options){
            case "A":
                context = new Context(new ConcreteStrategyA());
                context.ContextInterface();
                break;
            case "B":
                context = new Context(new ConcreteStrategyB());
                context.ContextInterface();
                break;
            case "C":
                context = new Context(new ConcreteStrategyC());
                context.ContextInterface();
                break;
        }
    }
}
