package com.mfc.design.解释器模式.加减法实例;

/**
 * @author MouFangCai
 * @date 2019/10/28 11:01
 * @description
 */
public class Constant extends Expression{

    private int value;

    public Constant(int value){
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {

        if(obj != null && obj instanceof Constant){
            return this.value == ((Constant)obj).value;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
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

