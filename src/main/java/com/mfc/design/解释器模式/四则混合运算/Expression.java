package com.mfc.design.解释器模式.四则混合运算;

/**
 * @author MouFangCai
 * @date 2019/10/28 11:01
 *
 * @description AbstractExpression（抽象表达式）
 */
public abstract class Expression {

    /**
     * 以环境为准，本方法解释给定的任何一个表达式
     */
    public abstract int interpret(Context ctx);

    /**
     * 将表达式转换成字符串
     */
    public abstract String toString();
}
