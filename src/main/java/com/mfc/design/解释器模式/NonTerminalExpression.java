package com.mfc.design.解释器模式;

/**
 * @author MouFangCai
 * @date 2019/10/28 10:34
 * @description
 */
public class NonTerminalExpression implements AbstractionExpression {

    @Override
    public void interpret(Context context) {
        System.out.println("非终端释器");
    }
}
