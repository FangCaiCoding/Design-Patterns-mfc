package com.mfc.design.命令模式;

/**
 * @author MouFangCai
 * @date 2019/10/23 17:38
 *
 * @description 抽象命令类
 */
public abstract class Command {

    protected Cook_Receiver receiver;

    public Command(Cook_Receiver receiver) {
        this.receiver = receiver;
    }

    // 执行命令
    abstract public void executeCommand();
    // 取消命令
    abstract public void cancelCommand();
}
