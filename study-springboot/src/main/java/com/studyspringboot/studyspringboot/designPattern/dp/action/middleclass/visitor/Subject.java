package com.studyspringboot.studyspringboot.designPattern.dp.action.middleclass.visitor;

public interface Subject {
    
    //接受将要访问它的对象
    public void accept(Visitor visitor);

    //获取将要被访问的属性
    public String getSubject();
}