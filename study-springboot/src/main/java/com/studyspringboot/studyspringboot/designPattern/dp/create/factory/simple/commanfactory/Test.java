package com.studyspringboot.studyspringboot.designPattern.dp.create.factory.simple.commanfactory;

/**
 * 测试
 * 
 * 作者: zhoubang 
 * 日期：2015年10月26日 下午4:50:49
 */
public class Test {
    
    public static void main(String[] args) {
        
        SendFactory factory = new SendFactory();
        
        //Sender sender = factory.produce("sms");//创建发送短信实现类
        
        //Sender sender = factory.produce("voice");//创建发送语音实现类
        
        Sender sender = factory.produce("mail");//创建发送邮件实现类
        
        //调用接口方法
        sender.send();
    }

    /*普通简单工厂：就是建立一个工厂类，对实现了同一接口的一些类进行实例的创建。*/
}
