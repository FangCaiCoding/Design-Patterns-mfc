package com.mfc.design.命令模式;

/**
 * @author MouFangCai
 * @date 2019/10/23 17:58
 *
 * @description 具体命令类(ConcreteCommand): 创建一个具体命令对象并设定它的接收者。通常会持有接收者
 */
public class Food2_Command extends Command {

    public Food2_Command(Cook_Receiver receiver) {
        super(receiver);
    }

    @Override
    public void executeCommand() {
        receiver.cookFood("清蒸鲫鱼");
    }

    @Override
    public void cancelCommand() {
        receiver.NotCookFood("清蒸鲫鱼");
    }
}
