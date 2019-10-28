package com.mfc.design.外观模式;

/**
 * @author MouFangCai
 * @date 2019/10/14 15:46
 */
public class Client_Facade {

    public static void main(String[] args) {
        Facade_BuyRoom facade_buyRoom = new Facade_BuyRoom();
        facade_buyRoom.buyRoom();
    }
}
