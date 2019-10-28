package com.mfc.design.备忘录模式;

/**
 * @author MouFangCai
 * @date 2019/10/18 17:27
 *
 * 备忘录：游戏储存箱，定义需要备忘的属性
 */
public class Role_Memento {

    /**
     * 我们在此保存3个属性
     */
    private int life;

    private int atk;

    private String level;

    // 将想要保存的属性 存入 储存箱中
    public Role_Memento(int life, int atk, String level) {
        this.life = life;
        this.atk = atk;
        this.level = level;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
