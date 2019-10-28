package com.mfc.design.观察者模式;

/**
 * @author MouFangCai
 * @date 2019/10/16 10:33
 *
 * 抽象观察者
 */
public abstract class Observer {

    private String name;
    private Subject subject;
    abstract void update(String newState);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
