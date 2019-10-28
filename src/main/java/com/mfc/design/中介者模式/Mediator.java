package com.mfc.design.中介者模式;

/**
 * @author MouFangCai
 * @date 2019/10/24 17:21
 *
 * @description 房屋中介：抽象中介者（Mediator）角色
 */
public interface Mediator {

    // 定义一个抽象的发消息方法，得到消息内容和同事对象
    void send(String message, Colleague sender);
}
