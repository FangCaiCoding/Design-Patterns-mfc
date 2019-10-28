package com.mfc.design.解释器模式.四则混合运算;

/**
 * @author MouFangCai
 * @date 2019/10/28 11:04
 * @description
 */
public class Client {

    public static void main(String[] args) {
        Context context = new Context();
        Constant c1 = new Constant(1);
        Constant c2 = new Constant(2);
        Constant c3 = new Constant(3);
        Constant c4 = new Constant(4);
        Expression exp = new Minus(new Plus(c3, c2), new Minus(c4, c1));
        System.out.println(exp.toString() + "=" + exp.interpret(context));
    }

}
