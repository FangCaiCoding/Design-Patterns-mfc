package com.mfc.design.职责链模式;

/**
 * @author MouFangCai
 * @date 2019/10/24 15:55
 * @description
 */
public class Client {

    public static void main(String[] args) {
        GroupLeader_ConcreteHandler groupLeader = new GroupLeader_ConcreteHandler("小组长");
        ChargeLeader_ConcreteHandler chargeLeader = new ChargeLeader_ConcreteHandler("主管");
        ManagerLeader_ConcreteHandler managerLeader = new ManagerLeader_ConcreteHandler("经理");
        // 设置对应的层级关系，可根据实际情况更改
        groupLeader.setSuperior(chargeLeader);
        chargeLeader.setSuperior(managerLeader);

        Rest_Request request1 = new Rest_Request();
        request1.setType("请假");
        request1.setContent("小李请假");
        request1.setSize(1);
        groupLeader.requestApplication(request1);

        request1 = new Rest_Request();
        request1.setType("请假");
        request1.setContent("小王请假");
        request1.setSize(3);
        groupLeader.requestApplication(request1);

        request1 = new Rest_Request();
        request1.setType("请假");
        request1.setContent("小赖请假");
        request1.setSize(10);
        groupLeader.requestApplication(request1);

        request1 = new Rest_Request();
        request1.setType("请假");
        request1.setContent("土豪请假");
        request1.setSize(15);
        groupLeader.requestApplication(request1);
    }
}
