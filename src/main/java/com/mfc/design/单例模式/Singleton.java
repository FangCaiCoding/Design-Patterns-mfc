package com.mfc.design.单例模式;

/**
 * @author MouFangCai
 * @date 2019/10/21 16:48
 *
 * @description
 */
public class Singleton {

    // 静态内部类
    // 由于SingletonInstance是私有静态内部类，所以不会被其他类知道
    private static class SingletonInstance{
        // 由于这个instance是static的，因此并不会构造多次
        // 类的构造必须是原子性的，非并发的，因此不需要加同步块
        private static final Singleton instance = new Singleton();
    }
    // 构造私有化，防止外部通过 new 的方式创建对象
    private Singleton() {

    }

    // 对外提供 获取实例 的静态方法
    public static Singleton getInstance(){
        return SingletonInstance.instance;
    }
}
