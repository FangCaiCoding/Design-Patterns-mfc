package com.mfc.design.桥接模式;

/**
 * @author MouFangCai
 * @date 2019/10/22 11:24
 *
 * @description 手机 扩充抽象类
 *  手机品牌1
 */
public class Brand1_RefinedAbstraction extends Phone_Abstraction {

    private String brandName;

    public Brand1_RefinedAbstraction() {
        this.brandName = "华为智能手机";
    }

    @Override
    public void run() {
        System.out.println(brandName + "--正在运行软件：");
        for (Soft_Implementor soft: getSoftList()) {
            soft.run();
        }
    }
}
