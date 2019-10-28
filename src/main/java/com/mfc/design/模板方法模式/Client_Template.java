package com.mfc.design.模板方法模式;

/**
 * @author MouFangCai
 * @date 2019/10/14 10:43
 */
public class Client_Template {

    public static void main(String[] args) {
        LogTemplate deleteLog = new DeleteLog();
        deleteLog.logOperation("mfc1");
        System.out.println("--------------------");
        LogTemplate updateLog = new UpdateLog();
        updateLog.logOperation("mfc2");
    }
}
