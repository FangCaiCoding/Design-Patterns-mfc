package com.mfc.design.外观模式;

/**
 * @author MouFangCai
 * @date 2019/10/14 15:37
 */
public class Facade_BuyRoom {

    private SubSystem01_SelectRoom selectRoom;
    private SubSystem02_Sign sign;
    private SubSystem03_Procedure procedure;
    private SubSystem04_Tollage tollage;
    private SubSystem05_Credential credential;

    public Facade_BuyRoom() {
        selectRoom = new SubSystem01_SelectRoom();
        sign = new SubSystem02_Sign();
        procedure = new SubSystem03_Procedure();
        tollage = new SubSystem04_Tollage();
        credential = new SubSystem05_Credential();
    }

    public void buyRoom(){
        System.out.println("买房开始");
        selectRoom.selectRoom();
        sign.sign();
        procedure.procedure();
        tollage.tollage();
        credential.credential();
        System.out.println("买房结束");
    }
}
