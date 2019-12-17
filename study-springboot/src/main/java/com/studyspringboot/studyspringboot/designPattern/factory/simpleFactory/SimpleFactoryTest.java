package com.studyspringboot.studyspringboot.designPattern.factory.simpleFactory;

/**
 * created by scott on 12/17/19
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
        ICourse course = CourseFactory.create(JavaCourse.class);
        String str = course.record();
        System.out.println(str);
    }
}
