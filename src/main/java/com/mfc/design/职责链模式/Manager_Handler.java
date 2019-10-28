package com.mfc.design.职责链模式;

/**
 * @author MouFangCai
 * @date 2019/10/24 15:26
 *
 * @description 抽象处理者（Handler）角色：定义一个处理请求的接口，包含抽象处理方法和一个后继连接。
 */
public abstract class Manager_Handler {

    protected String name;
    // 上一级管理者
    protected Manager_Handler superior;

    public Manager_Handler(String name) {
        this.name = name;
    }
    // 设置上一级管理者
    public void setSuperior(Manager_Handler superior){
        this.superior = superior;
    }

    abstract public void requestApplication(Rest_Request request);
}
