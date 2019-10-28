package com.mfc.design.解释器模式.加减法实例;

/**
 * @author MouFangCai
 * @date 2019/10/28 11:04
 * @description
 */
public class Minus extends Expression {

    private Expression left, right;

    public Minus(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Minus) {
            return left.equals(((Minus) obj).left) && right.equals(((Minus) obj).right);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }

    @Override
    public int interpret(Context ctx) {

        return left.interpret(ctx) - right.interpret(ctx);
    }

    @Override
    public String toString() {
        return "(" + left.toString() + " - " + right.toString() + ")";
    }
}
