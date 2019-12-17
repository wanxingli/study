package com.studyspringboot.studyspringboot.designPattern.factory.simpleFactory;

/**
 * created by scott on 12/17/19
 */
public class CourseFactory {

    public static ICourse create(Class<? extends ICourse> clazz) {
        try {
            if (null != clazz) {
                return clazz.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
