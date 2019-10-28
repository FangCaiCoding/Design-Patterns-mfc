package com.mfc.design.解释器模式;

/**
 * @author MouFangCai
 * @date 2019/10/28 10:34
 * @description
 */
public class TerminalExpression implements AbstractionExpression {

    @Override
    public void interpret(Context context) {
        System.out.println("终端解释器");
    }
}
