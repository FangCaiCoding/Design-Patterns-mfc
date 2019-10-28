package com.mfc.design.观察者模式;

/**
 * @author MouFangCai
 * @date 2019/10/16 10:36
 *
 * 具体观察者
 */
public class ConcreteObserver2 extends Observer {



    public ConcreteObserver2(String name, Subject subject) {
        this.setName(name);
        this.setSubject(subject);
    }

    @Override
    public void update(String newState) {

        System.out.println("观察者:" + this.getName() + "——收到[" + this.getSubject().getSubjectName() + "]通知{"+newState +"}，改变状态");

    }
}
