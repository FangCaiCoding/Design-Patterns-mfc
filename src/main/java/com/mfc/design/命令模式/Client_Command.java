package com.mfc.design.命令模式;

/**
 * @author MouFangCai
 * @date 2019/10/24 9:32
 * @description
 */
public class Client_Command {

    public static void main(String[] args) {
        // 餐厅准备开始营业
        Cook_Receiver receiver = new Cook_Receiver();
        Food1_Command food1Command = new Food1_Command(receiver);
        Food2_Command food2Command = new Food2_Command(receiver);
        Waiter_Invoker waiter = new Waiter_Invoker();
        // 顾客点菜
        waiter.addOrder(food1Command);
        waiter.addOrder(food2Command);

        System.out.println("--------");
        // 点菜完毕，通知厨房
        waiter.notifyCook();

        System.out.println("--------");
        // 顾客觉得菜多了，取消一个
        waiter.cancelOrder(food1Command);
        waiter.notifyNotCook();

    }
}
