package com.mfc.design.解释器模式.四则混合运算;

import java.util.Stack;

/**
 * @author MouFangCai
 * @date 2019/10/28 11:34
 * @description
 */
public class InterpretUtils {

    public static int input(String equation){
        Context context = new Context();
        int result = 0;
        String[] equations = equation.split(" ");
        for (int i = 0; i < equations.length - 1; i++) {
            Constant c1 = new Constant(result);
            if (equations[i].equals("+")) {
                Constant c2 = new Constant(new Integer(equations[++i]));
                result= new Plus(c1, c2).interpret(context);
            } else if (equations[i].equals("-")) {
                Constant c2 = new Constant(new Integer(equations[++i]));
                result= new Minus(c1, c2).interpret(context);
            } else {
                result = new Constant(new Integer(equations[i])).interpret(context);
            }
        }
        return result;
    }
}
