package com.mfc.design.观察者模式;

/**
 * @author MouFangCai
 * @date 2019/10/16 10:44
 *
 * 具体通知者
 */
public class ConcreteSubject extends Subject {

    private String state;

    public ConcreteSubject(String name) {
        setSubjectName(name);
    }

    public void change(String newState) {
        this.state = state;

        notifyAllObserver(newState);
    }
}
