package com.studyspringboot.studyspringboot.designPattern.dp.structure.bridge;

/**
 * 
 * 相当于驱动管理器，DriverManager
 */
public class MyBridge extends Bridge {
    
    public void connect() {
        getSource().connect();
    }
}