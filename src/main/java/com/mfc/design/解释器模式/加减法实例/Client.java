package com.mfc.design.解释器模式.加减法实例;

/**
 * @author MouFangCai
 * @date 2019/10/28 11:04
 * @description
 */
public class Client {

    public static void main(String[] args) {
        Context ctx = new Context();
        Variable x = new Variable("x");
        Variable y = new Variable("y");
        Constant c = new Constant(1);
        ctx.assign(x, 2);
        ctx.assign(y, 3);

        Expression exp = new Plus(new Plus(c,x) , new Minus(y,x));
        System.out.println(exp.toString() + "=" + exp.interpret(ctx));

        Context context2 = new Context();
        Constant c1 = new Constant(1);
        Constant c2 = new Constant(2);
        Constant c3 = new Constant(3);
        Constant c4 = new Constant(4);
        Expression exp1 = new Plus(new Plus(c2,c1) , new Minus(c3,c4));
        System.out.println(exp1.toString() + "=" + exp1.interpret(context2));

    }

}
