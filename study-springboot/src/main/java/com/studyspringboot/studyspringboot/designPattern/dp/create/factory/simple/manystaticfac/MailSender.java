package com.studyspringboot.studyspringboot.designPattern.dp.create.factory.simple.manystaticfac;

/**
 * 发送邮件，实现Sender接口
 * 
 * 作者: zhoubang 
 * 日期：2015年10月26日 下午4:45:36
 */
public class MailSender implements Sender {

    @Override
    public void send() {
        System.out.println("这是在发送邮件...");
    }

}

