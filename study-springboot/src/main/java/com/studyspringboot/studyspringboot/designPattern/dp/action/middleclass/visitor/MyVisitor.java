package com.studyspringboot.studyspringboot.designPattern.dp.action.middleclass.visitor;

public class MyVisitor implements Visitor {

    @Override
    public void visit(Subject sub) {
        System.out.println("visit the subject：" + sub.getSubject());
    }
}