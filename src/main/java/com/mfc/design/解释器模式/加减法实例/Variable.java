package com.mfc.design.解释器模式.加减法实例;

/**
 * @author MouFangCai
 * @date 2019/10/28 11:01
 * @description
 */
public class Variable extends Expression {

    private String name;

    public Variable(String name){
        this.name = name;
    }
    @Override
    public boolean equals(Object obj) {

        if(obj != null && obj instanceof Variable)
        {
            return this.name.equals(
                    ((Variable)obj).name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int interpret(Context ctx) {
        return ctx.lookup(this);
    }

}
