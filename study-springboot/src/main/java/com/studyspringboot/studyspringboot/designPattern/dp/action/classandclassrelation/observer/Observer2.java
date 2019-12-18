package com.studyspringboot.studyspringboot.designPattern.dp.action.classandclassrelation.observer;

public class Observer2 implements Observer {

    @Override
    public void update() {
        System.out.println("观察者2接收到通知...");
    }

}