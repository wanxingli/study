package com.studyspringboot.studyspringboot.designPattern.dp.create.factory.method;

/**
 * 
 * 作者: zhoubang 日期：2015年10月26日 下午4:50:49
 */
public class Test {

    public static void main(String[] args) {

        //生产对象
        //Provider provider = new SendMailFactory();//获取发送邮件工厂实例
        Provider provider = new SendSmsFactory();//获取发送短信工厂实例
        
        //调用生成对象的方法，获取对应的实例
        Sender sender = provider.produce();
        
        //调用实例方法
        sender.send();
    }
    
    
    
    /*
     * 
     * 【工厂方法模式】好处就是，如果你现在想增加一个功能：发及时信息，则只需做一个实现类，实现Sender接口，
     * 同时做一个工厂类，实现Provider接口，就OK了，这样做，拓展性较好！
     * 无需去改动现成的代码(比如在之前的SendFactory里面新增一个法)。
     *
     * 【简单工厂模式】有一个问题就是，类的创建依赖工厂类，也就是说，如果想要拓展程序，必须对工厂类进行修改，
     * 这违背了闭包原则，所以，从设计角度考虑，有一定的问题。
     *
     * 如何解决？就用到工厂方法模式，创建一个工厂接口和创建多个工厂实现类，这样一旦需要增加新的功能，
     * 直接增加新的工厂类就可以了，不需要修改之前的代码。
     *
     * 【工厂方法模式】好处就是，如果你现在想增加一个功能：发及时信息，则只需做一个实现类，实现Sender接口，
     * 同时做一个工厂类，实现Provider接口，就OK了，这样做，拓展性较好！
     * 无需去改动现成的代码(比如在之前的SendFactory里面新增一个法)。
     * */
}
