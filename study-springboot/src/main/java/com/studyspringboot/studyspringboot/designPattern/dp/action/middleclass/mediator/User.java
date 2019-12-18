package com.studyspringboot.studyspringboot.designPattern.dp.action.middleclass.mediator;

public abstract class User {

    //保持与中介的关系，交给中介来管理类与类之间的关系
    private Mediator mediator;

    public Mediator getMediator() {
        return mediator;
    }

    public User(Mediator mediator) {
        this.mediator = mediator;
    }

    //具体工作，交给实现类实现
    public abstract void work();
}