package com.mfc.design.观察者模式;

/**
 * @author MouFangCai
 * @date 2019/10/16 14:09
 */
public class Client_Observer {

    public static void main(String[] args) {
        Subject subject = new ConcreteSubject("通知者");
        ConcreteObserver1 observer1 = new ConcreteObserver1("观察者1", subject);
        ConcreteObserver2 observer2 = new ConcreteObserver2("观察者2", subject);

        subject.attach(observer2);
        subject.attach(observer1);
        subject.notifyAllObserver("消息来了");

    }
}
