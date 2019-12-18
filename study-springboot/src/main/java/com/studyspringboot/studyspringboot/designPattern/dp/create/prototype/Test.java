package com.studyspringboot.studyspringboot.designPattern.dp.create.prototype;

import java.io.IOException;

/**
 * 测试
 * 
 * 作者: zhoubang 
 * 日期：2015年10月27日 下午3:59:36
 */
public class Test {

    public static void main(String[] args) throws ClassNotFoundException, IOException {
        
        //测试浅复制的
        
        //创建一个对象
        PrototypeShallowCopy pro = new ConcretePrototypeShallowCopy("浅复制名称");
        //克隆上面的对象，包括其属性
        PrototypeShallowCopy pro2 = (PrototypeShallowCopy) pro.clone();
        
        System.out.println(pro.getName());//输出prototype
        System.out.println(pro2.getName());//输出prototype
        
        
        
        //========================================================================================================
        
        
        
        //测试深复制的
        
        //创建一个对象
        ConcretePrototypeDeepCopy pro3 = new ConcretePrototypeDeepCopy("深复制名称","性别男");
        //克隆上面的对象，包括其属性
        PrototypeDeepCopy pro4 = (PrototypeDeepCopy) pro3.deepClone();
        
        System.out.println(pro4.getName());
        System.out.println(pro4.getObj().getSex());
    }

    /**
     *原型模式虽然是创建型的模式，但是与工程模式没有关系，从名字即可看出，该模式的思想就是将一个对象作为原型，
     * 对其进行复制、克隆，产生一个和原对象类似的新对象。本小结会通过对象的复制，进行讲解。
     * 在Java中，复制对象是通过clone()实现的，一个原型类，只需要实现Cloneable接口，覆写clone方法，
     * 此处clone方法可以改成任意的名称，因为Cloneable接口是个空接口。
     * 你可以任意定义实现类的方法名，如cloneA或者cloneB，因为此处的重点是super.clone()这句话，
     * super.clone()调用的是Object的clone()方法，而在Object类中，clone()是native的.
     * 结合对象的浅复制和深复制来说一下，首先需要了解对象深、浅复制的概念：
     * 浅复制：将一个对象复制后，基本数据类型的变量都会重新创建，而引用类型，指向的还是原对象所指向的。
     * 深复制：将一个对象复制后，不论是基本数据类型还有引用类型，都是重新创建的。简单来说，
     * 就是深复制进行了完全彻底的复制，而浅复制不彻底。要实现深复制，需要采用流的形式读入当前对象的二进制输入，
     * 再写出二进制数据对应的对象。
     */
}
