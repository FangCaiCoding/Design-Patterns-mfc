package com.mfc.design.备忘录模式;

/**
 * @author MouFangCai
 * @date 2019/10/18 17:34
 *
 * 游戏备忘录管理者
 */
public class Game_Caretaker {

    private Role_Memento roleMemento;

    public Role_Memento getRoleMemento() {
        return roleMemento;
    }

    public void setRoleMemento(Role_Memento roleMemento) {
        this.roleMemento = roleMemento;
    }
}
