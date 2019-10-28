package com.mfc.design.解释器模式.四则混合运算;

/**
 * @author MouFangCai
 * @date 2019/10/28 11:01
 *
 * @description NonterminalExpression（非终结符表达式）
 */
public class Plus extends Expression {

    private Expression left,right;

    public Plus(Expression left , Expression right){
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context ctx) {

        return left.interpret(ctx) + right.interpret(ctx);
    }

    @Override
    public String toString() {
        return "(" + left.toString() + " + " + right.toString() + ")";
    }

}

