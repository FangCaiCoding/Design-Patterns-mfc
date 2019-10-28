package com.mfc.design.中介者模式;

/**
 * @author MouFangCai
 * @date 2019/10/24 17:23
 *
 * @description 具体同事类（Concrete Colleague）角色
 */
public class Seller_ConcreteColleague extends Colleague{

    public Seller_ConcreteColleague(Mediator mediator) {
        super(mediator);
    }

    // 通过中介者 发消息
    public void send(String message) {
        mediator.send(message,this);
    }

    public void notify(String message) {
        System.out.println("seller收到消息：" + message);
    }

}
