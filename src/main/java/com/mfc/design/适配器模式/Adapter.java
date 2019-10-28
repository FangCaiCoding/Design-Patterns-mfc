package com.mfc.design.适配器模式;

/**
 * @author MouFangCai
 * @date 2019/10/17 17:59
 */
public class Adapter extends Target {
    // 创建一个私有的Adaptee对象
    private Adaptee adaptee =new Adaptee();

    // 这样就把表面上调用request()变成实际调用specificRequest()
    @Override
    public void request() {
       adaptee.specificRequest();
    }
}
