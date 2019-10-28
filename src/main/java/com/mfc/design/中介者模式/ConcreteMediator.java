package com.mfc.design.中介者模式;

import lombok.Data;

/**
 * @author MouFangCai
 * @date 2019/10/24 17:24
 *
 * @description 链家：具体中介者（ConcreteMediator）角色
 */
@Data
public class ConcreteMediator implements Mediator{

    private Buyer_ConcreteColleague buyer;
    private Seller_ConcreteColleague seller;

    // 具体中介者维护 同事间的交互
    @Override
    public void send(String message, Colleague sender) {
        // buyer发消息给seller
        if (sender instanceof Buyer_ConcreteColleague) {
            // seller 收到消息
            System.out.println("Buyer发消息给你了：");
            seller.notify(message);
            System.out.println();
        } else {
            System.out.println("Seller发消息给你了：");
            buyer.notify(message);
            System.out.println();
        }
    }
}
