package com.studyspringboot.studyspringboot.designPattern.dp.create.factory.simple.manystaticfac;

/**
 * 提供2个静态方法
 * 
 * 作者: zhoubang 
 * 日期：2015年10月26日 下午5:05:50
 */
public class SendFactory {

    
    public static Sender produceMail() {
        return new MailSender();
    }

    
    public static Sender produceSms() {
        return new SmsSender();
    }
}
