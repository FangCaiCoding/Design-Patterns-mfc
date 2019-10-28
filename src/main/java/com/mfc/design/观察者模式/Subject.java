package com.mfc.design.观察者模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @author MouFangCai
 * @date 2019/10/16 10:39
 *
 * 抽象通知者
 */
public class Subject {

    private String subjectName;

    private List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notifyAllObserver(String newState){
        for (Observer ob : observers) {
                ob.update(newState );
        }
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }
}
