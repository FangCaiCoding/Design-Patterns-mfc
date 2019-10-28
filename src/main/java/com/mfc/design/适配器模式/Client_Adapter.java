package com.mfc.design.适配器模式;

/**
 * @author MouFangCai
 * @date 2019/10/17 18:02
 */
public class Client_Adapter {

    public static void main(String[] args) {
        Target target = new Adapter();
        // 对于客户端来说，调用的就是Target的request()
        target.request();
    }
}
