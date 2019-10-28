package com.mfc.design.职责链模式;

/**
 * @author MouFangCai
 * @date 2019/10/24 15:35
 *
 * @description 主管：具体处理者（Concrete Handler）角色：实现抽象处理者的处理方法
 *
 */
public class ChargeLeader_ConcreteHandler extends Manager_Handler {
    public ChargeLeader_ConcreteHandler(String name) {
        super(name);
    }

    @Override
    public void requestApplication(Rest_Request request) {
        // 主管的权限是：审批请假1-3天
        if (request.getType().equals("请假") && request.getSize() <= 3 ) {
            System.out.println(request.getContent() + request.getSize() + "天，被批准————" + name);
        } else {
            // 其余申请转到上级
            if (superior != null) {
                superior.requestApplication(request);
            }
        }
    }
}
