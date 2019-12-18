package com.studyspringboot.studyspringboot.designPattern.dp.action.classStatus.memento;

/**
 * 存储备忘录的类
 * 
 * 作者: zhoubang 
 * 日期：2015年10月29日 上午9:38:07
 */
public class Storage {

    //拥有备忘录类的实例
    private Memento memento;

    public Storage(Memento memento) {
        this.memento = memento;
    }

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}