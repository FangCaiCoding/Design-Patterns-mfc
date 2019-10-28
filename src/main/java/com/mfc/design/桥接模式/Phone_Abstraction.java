package com.mfc.design.桥接模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @author MouFangCai
 * @date 2019/10/22 10:48
 *
 * @description 手机品牌类 抽象类
 */
public abstract class Phone_Abstraction {

    // 一个手机 可以安装多个软件
    private List<Soft_Implementor> softList = new ArrayList<>();

    // 安装软件
    public  void addSoft(Soft_Implementor soft){
        softList.add(soft);
    }
    // 软件运行
    public abstract void run();

    public List<Soft_Implementor> getSoftList() {
        return softList;
    }
}
