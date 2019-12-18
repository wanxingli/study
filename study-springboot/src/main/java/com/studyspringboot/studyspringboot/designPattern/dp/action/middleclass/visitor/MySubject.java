package com.studyspringboot.studyspringboot.designPattern.dp.action.middleclass.visitor;

public class MySubject implements Subject {

    //接受将要访问它的对象
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    
    //获取将要被访问的属性
    @Override
    public String getSubject() {
        return "love";
    }
}