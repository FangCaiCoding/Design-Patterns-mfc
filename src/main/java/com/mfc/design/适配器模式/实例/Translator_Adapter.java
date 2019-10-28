package com.mfc.design.适配器模式.实例;

/**
 * @author MouFangCai
 * @date 2019/10/18 16:04
 *
 * Adapter（适配器类）：作为一个转换器
 */
public class Translator_Adapter extends Foreigner_Target {

    private Chinese_Adaptee adaptee = new Chinese_Adaptee("中国人：");

    public Translator_Adapter(String name) {
        super(name);
        adaptee.setName(name);

    }

    // 翻译者将“Foreigner_Target”说的话，翻译为 中国人 说的话
    @Override
    public void speak() {
        adaptee.说话();
    }
}
