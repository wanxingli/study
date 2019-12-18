package com.studyspringboot.studyspringboot.designPattern.dp.action.classandclassrelation.command;

/**
 * 被调用者，模拟士兵
 * 
 * 作者: zhoubang 
 * 日期：2015年10月29日 上午9:26:42
 */
public class Receiver {
    
    //执行命令
    public void action() {
        System.out.println("命令收到了，开始执行。");
    }
}