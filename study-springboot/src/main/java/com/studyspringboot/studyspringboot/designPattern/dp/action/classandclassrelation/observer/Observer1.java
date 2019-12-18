package com.studyspringboot.studyspringboot.designPattern.dp.action.classandclassrelation.observer;

public class Observer1 implements Observer {

    @Override
    public void update() {
        System.out.println("观察者1接收到通知...");
    }
}