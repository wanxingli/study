package com.studyspringboot.studyspringboot.designPattern.dp.create.factory.simple.manystaticfac;

/**
 * 
 * 作者: zhoubang 日期：2015年10月26日 下午4:50:49
 */
public class Test {

    public static void main(String[] args) {

        //调用工厂静态方法，获取对应的实例
        
        //Sender sender = SendFactory.produceMail();//发送邮件实例
        
        Sender sender = SendFactory.produceSms();//发送短信实例
        
        //调用实例方法
        sender.send();
    }
    
    
    /*
     * 【多个静态方法模式】与 【多个工厂方法模式】的比较，优点在于：
     * 
     * 1、无须创建工厂对象，减少内存开销
     * 2、直接调用工厂方法获取对应的实例
     * 【多个静态方法】 与 【多个工厂方法模式】 的不同在于： 将【多个工厂方法模式】里的工厂方法置为静态的，
     * 不需要创建工厂对象，直接调用工厂的静态方法获取实例对象。
     * */
}
