package com.studyspringboot.studyspringboot.designPattern.dp.action.classandclassrelation.observer;

public class MySubject extends AbstractSubject {

    @Override
    public void operation() {
        System.out.println("开始更新自身的信息....");
        notifyObservers();
    }

}