package com.mfc.design.状态模式;

/**
 * @author MouFangCai
 * @date 2019/10/17 15:36
 */
public interface State {

    // 定义一个接口以封装与Context的一个特定状态相关的行为
    public void doAction(Context context);

}
