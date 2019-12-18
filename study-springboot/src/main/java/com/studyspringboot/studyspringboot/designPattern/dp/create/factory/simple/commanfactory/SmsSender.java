package com.studyspringboot.studyspringboot.designPattern.dp.create.factory.simple.commanfactory;

/**
 * 发送短信，实现Sender接口
 * 
 * 作者: zhoubang 
 * 日期：2015年10月26日 下午4:46:48
 */
public class SmsSender implements Sender {

    @Override
    public void send() {
        System.out.println("这是在发送短信...");
    }

}

