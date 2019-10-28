package com.mfc.design.备忘录模式;

/**
 * @author MouFangCai
 * @date 2019/10/18 17:18
 *
 * 发起人：需要 保存的对象
 */
public class GameRole_Originator {

    private String name;
    /**
     * 生命值
     */
    private int life;

    /**
     * 攻击力
     */
    private int atk;

    /**
     * 当前游戏 关数 如：1-1
     */
    private String level;


    // 保存进度
    public Role_Memento saveGame(){
        return new Role_Memento(life, atk, level);
    }

    // 恢复角色状态
    public void recoveryGame(Role_Memento role_memento){
        this.life = role_memento.getLife();
        this.atk = role_memento.getAtk();
        this.level = role_memento.getLevel();
    }

    public void gameInit(String name){
       setName(name);
       setAtk(100);
       setLife(500);
       setLevel("1-1");
    }

    public void fight(){
        setLife(getLife() - 100);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return "当前角色信息{" +
                "name='" + name + '\'' +
                ", life=" + life +
                ", atk=" + atk +
                "-----当前关卡：'" + level + '\'' +
                '}';
    }
}
