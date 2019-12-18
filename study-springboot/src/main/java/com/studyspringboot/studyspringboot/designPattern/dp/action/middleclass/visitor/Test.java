package com.studyspringboot.studyspringboot.designPattern.dp.action.middleclass.visitor;

/**
 * 观察者模式
 */
public class Test {

    public static void main(String[] args) {
        
        //创建需要被访问的对象
        Visitor visitor = new MyVisitor();
        
        //创建接收对象
        Subject sub = new MySubject();
        
        //接受将要访问它的对象
        sub.accept(visitor);
    }

    /**
     *
     简单来说，访问者模式就是一种分离对象数据结构与行为的方法，通过这种分离，
     可达到：为一个被访问者动态添加新的操作而无需做其它的修改的效果。


     该模式适用场景：
     如果我们想为一个现有的类增加新功能，不得不考虑几个事情：
     1、新功能会不会与现有功能出现兼容性问题？
     2、以后会不会再需要添加？3、如果类不允许修改代码怎么办？
     面对这些问题，最好的解决方法就是使用访问者模式，访问者模式适用于数据结构相对稳定的系统，把数据结构和算法解耦
     */
}