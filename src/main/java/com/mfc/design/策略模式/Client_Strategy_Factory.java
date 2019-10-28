package com.mfc.design.策略模式;

/**
 * @author MouFangCai
 * @date 2019/10/11 11:36
 */
public class Client_Strategy_Factory {


    public static void main(String[] args) {
        String options =  "A";
        Context_Factory a = new Context_Factory(options);
        a.ContextInterface();
    }

}
