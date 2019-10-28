package com.mfc.design.备忘录模式;

/**
 * @author MouFangCai
 * @date 2019/10/18 17:37
 */
public class Client_Memento {

    public static void main(String[] args) {

        GameRole_Originator gameRole = new GameRole_Originator();
        gameRole.gameInit("拳王");
        System.out.println("初始状态：" + gameRole.toString());

        // 打怪
        gameRole.fight();

        // 保存游戏进度
        Game_Caretaker gameCaretaker = new Game_Caretaker();
        gameCaretaker.setRoleMemento(gameRole.saveGame());
        System.out.println("保存进度：" + gameRole.toString());

        // 打怪
        gameRole.fight();
        gameRole.fight();
        System.out.println("打怪后，感觉打不过了：" + gameRole.toString());

        // 恢复游戏进度
        gameRole.recoveryGame(gameCaretaker.getRoleMemento());
        System.out.println("恢复的进度为：" + gameRole.toString());
    }
}
