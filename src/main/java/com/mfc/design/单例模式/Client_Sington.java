package com.mfc.design.单例模式;

/**
 * @author MouFangCai
 * @date 2019/10/21 17:10
 *
 * @description
 */
public class Client_Sington {

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);

    }
}
