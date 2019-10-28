package com.mfc.design.适配器模式.实例;

/**
 * @author MouFangCai
 * @date 2019/10/18 16:07
 */
public class Client_Adapter {

    public static void main(String[] args) {
        Foreigner_Target target = new American("American");
        target.speak();

        Foreigner_Target target1 = new Translator_Adapter("翻译官");
        target1.speak();

    }
}
