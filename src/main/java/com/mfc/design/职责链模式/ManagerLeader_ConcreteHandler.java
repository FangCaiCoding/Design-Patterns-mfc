package com.mfc.design.职责链模式;

/**
 * @author MouFangCai
 * @date 2019/10/24 15:35
 *
 * @description 经理：具体处理者（Concrete Handler）角色：实现抽象处理者的处理方法
 *
 */
public class ManagerLeader_ConcreteHandler extends Manager_Handler {
    public ManagerLeader_ConcreteHandler(String name) {
        super(name);
    }

    @Override
    public void requestApplication(Rest_Request request) {
        // 经理的权限是：都可审批
        if (request.getType().equals("请假") && request.getSize() <= 10 ) {
            System.out.println(request.getContent() + request.getSize() + "天，被批准————" + name);
        } else {
            System.out.println("请假这么久，你直接去财务结账走人吧————" + name);
        }
    }
}
