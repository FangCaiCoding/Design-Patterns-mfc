package com.mfc.design.模板方法模式;

/**
 * @author MouFangCai
 * @date 2019/10/14 10:39
 */
public class DeleteLog extends LogTemplate {
    @Override
    public void operation() {
        System.out.println("删除日志");
    }

    @Override
    public void sendMessage(String userName) {
        System.out.println("DeleteLog中，钩子方法被重写\n" + userName + ":删除了日志");
    }
}
