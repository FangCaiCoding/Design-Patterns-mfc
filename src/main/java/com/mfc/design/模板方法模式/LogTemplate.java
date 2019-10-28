package com.mfc.design.模板方法模式;

/**
 * @author MouFangCai
 * @date 2019/10/14 10:22
 */
public abstract class LogTemplate {

    public void logOperation(String userName){
        // 固定方法：子类不能重写
        authentication(userName);
        // 抽象方法：子类必须自定义实现
        operation();
        // 钩子方法：子类可以重写自定义
        sendMessage(userName);
    }

    // 固定方法：1、用户身份验证（该方法被final修饰，禁止被子类恶意篡改）
    private final void authentication(String userName){
        System.out.println(userName + "：身份验证通过");
    }

    // 抽象方法：2、自定义日志操作
    public abstract void operation();

    // 钩子方法：3、发送通知
    public  void sendMessage(String userName){
        System.out.println(userName + ":操作了日志");
    }

}
