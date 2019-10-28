package com.mfc.design.解释器模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @author MouFangCai
 * @date 2019/10/28 10:37
 * @description
 */
public class Client {

    public static void main(String[] args) {
        Context context = new Context();
        List<AbstractionExpression> list = new ArrayList<>();
        list.add(new TerminalExpression());
        list.add(new NonTerminalExpression());

        for (AbstractionExpression ab : list) {
            ab.interpret(context);
        }
    }
}
