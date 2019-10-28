package com.mfc.design.中介者模式;

/**
 * @author MouFangCai
 * @date 2019/10/24 17:54
 * @description
 */
public class Client {
    public static void main(String[] args) {
        // 链家：中介
        ConcreteMediator mediator = new ConcreteMediator();
        // 让两个客户都认识中介
        Buyer_ConcreteColleague buyer = new Buyer_ConcreteColleague(mediator);
        Seller_ConcreteColleague seller = new Seller_ConcreteColleague(mediator);
        // 让中介都认识两个同事
        mediator.setBuyer(buyer);
        mediator.setSeller(seller);
        // 同事类对象互通消息，都是通过中介转发的
        buyer.send("这个房子100万，卖不");
        seller.send("100万太低了，至少得110万");
    }
}
