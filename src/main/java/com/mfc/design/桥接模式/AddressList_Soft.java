package com.mfc.design.桥接模式;

/**
 * @author MouFangCai
 * @date 2019/10/22 11:31
 *
 * @description 具体实现类
 */
public class AddressList_Soft implements Soft_Implementor {
    @Override
    public void run() {
        System.out.println("手机通讯录——运行");
    }
}
