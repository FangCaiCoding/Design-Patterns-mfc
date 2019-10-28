package com.mfc.design.命令模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @author MouFangCai
 * @date 2019/10/23 17:37
 *
 * @description 调用者(Invoker): 要求该命令执行这个请求。通常会持有命令对象
 */
public  class Waiter_Invoker {

    // 客户点的菜单
    private List<Command> orders = new ArrayList<>();
    // 客户取消的菜单
    private List<Command> cancelOrders = new ArrayList<>();

    public void addOrder(Command command) {
        orders.add(command);
        if (command instanceof Food1_Command) {
            System.out.println("客户新增菜品：" + "红烧排骨");
        }
        if (command instanceof Food2_Command) {
            System.out.println("客户新增菜品：" + "清蒸鲫鱼");
        }
    }

    public void cancelOrder(Command command) {
        if (orders.remove(command)) {
            cancelOrders.add(command);
            if (command instanceof Food1_Command) {
                System.out.println("客户取消菜品：" + "红烧排骨");
            }
            if (command instanceof Food2_Command) {
                System.out.println("客户取消菜品：" + "清蒸鲫鱼");
            }
        }else {
            System.out.println("对不起，您刚才没点这个菜品呢！");
        }
    }

    // 通知 厨师 执行
    public void notifyCook() {
        for (Command order : orders) {
            order.executeCommand();
        }
    }
    // 通知 厨师 取消执行
    public void notifyNotCook() {
        for (Command order : cancelOrders) {
            order.cancelCommand();
        }
    }
}
