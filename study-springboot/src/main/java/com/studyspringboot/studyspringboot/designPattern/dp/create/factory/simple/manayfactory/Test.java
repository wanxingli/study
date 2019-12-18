package com.studyspringboot.studyspringboot.designPattern.dp.create.factory.simple.manayfactory;

/**
 * 
 * 作者: zhoubang 日期：2015年10月26日 下午4:50:49
 */
public class Test {

    public static void main(String[] args) {

        //创建工厂类
        SendFactory factory = new SendFactory();
        
        //调用工厂方法，获取对应的实例
        
        //Sender sender = factory.produceMail();//发送邮件实例
        Sender sender = factory.produceSms();//发送短信实例
        
        //调用实例方法
        sender.send();
    }
    
    
    /*
     * 【多个工厂方法模式】与 【普通工厂方法模式】的比较，优点在于：
     * 
     * 1、无须手动输入参数创建实例对象
     * 2、避免了参数输入错误，导致实例创建失败，系统出错。
     * 3、直接调用方法即可创建实例对象
     * 4、 需要哪些实例，只需要在工厂中声明方法
     * 5、不会出现其他未从出现的实例对象
     * 6、...
     * 多个工厂方法模式：是对普通工厂方法模式的改进，在普通工厂方法模式中，如果传递的字符串出错，则不能正确创建对象，
     * 而多个工厂方法模式是提供多个工厂方法，分别创建对象。
     * 【多个工厂方法模式】 与 【普通工厂方法模式】 的不同点在于：只需要改动下SendFactory类就行。具体实现请看源代码。
     */
}
