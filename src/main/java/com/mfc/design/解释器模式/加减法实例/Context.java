package com.mfc.design.解释器模式.加减法实例;

import java.util.HashMap;
import java.util.Map;

/**
 * @author MouFangCai
 * @date 2019/10/28 11:01
 * @description
 */
public class Context {

    private Map<Variable,Integer> map = new HashMap<Variable,Integer>();

    public void assign(Variable var , int value){
        map.put(var, new Integer(value));
    }

    public int lookup(Variable var) throws IllegalArgumentException{
        Integer value = map.get(var);
        if(value == null){
            throw new IllegalArgumentException();
        }
        return value.intValue();
    }
}
