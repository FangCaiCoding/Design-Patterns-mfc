package com.mfc.design.解释器模式.四则混合运算;

/**
 * @author MouFangCai
 * @date 2019/10/28 11:01
 *
 * @description TerminalExpression（终结符表达式）
 */
public class Constant extends Expression {

    private int value;

    public Constant(int value){
        this.value = value;
    }

    @Override
    public int interpret(Context ctx) {

        return value;
    }

    @Override
    public String toString() {
        return new Integer(value).toString();
    }

}

