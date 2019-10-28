package com.mfc.design.桥接模式;

/**
 * @author MouFangCai
 * @date 2019/10/22 11:35
 * @description
 */
public class Client_Bridge {

    public static void main(String[] args) {
        Brand1_RefinedAbstraction phone1 = new Brand1_RefinedAbstraction();
        // 安装软件
        phone1.addSoft(new Game_Soft());
        phone1.addSoft(new AddressList_Soft());
        // 运行软件
        phone1.run();

        System.out.println();
        Brand2_RefinedAbstraction phone2 = new Brand2_RefinedAbstraction();
        phone2.addSoft(new AddressList_Soft());
        phone2.run();
    }
}
