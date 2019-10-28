package com.mfc.design.职责链模式;

/**
 * @author MouFangCai
 * @date 2019/10/24 15:35
 *
 * @description 组长：具体处理者（Concrete Handler）角色：实现抽象处理者的处理方法
 *
 */
public class GroupLeader_ConcreteHandler extends Manager_Handler {
    public GroupLeader_ConcreteHandler(String name) {
        super(name);
    }

    @Override
    public void requestApplication(Rest_Request request) {
        // 组长的权限是：审批请假1天以内的
        if (request.getType().equals("请假") && request.getSize() <= 1 ) {
            System.out.println(request.getContent() + request.getSize() + "天，被批准————" + name);
        } else {
            // 其余申请转到上级
            if (superior != null) {
                superior.requestApplication(request);
            }
        }
    }
}
