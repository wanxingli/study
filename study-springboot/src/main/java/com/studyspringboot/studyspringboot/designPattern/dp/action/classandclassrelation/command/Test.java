package com.studyspringboot.studyspringboot.designPattern.dp.action.classandclassrelation.command;

/**
 * 命令模式
 */
public class Test {
    public static void main(String[] args) {
        
        //创建士兵对象
        Receiver receiver = new Receiver();
        
        Command cmd = new MyCommand(receiver);
        
        //创建司令对象
        Invoker invoker = new Invoker(cmd);
        
        //发起命令
        invoker.action();
    }

    /**
     *
     命令模式很好理解，举个例子，司令员下令让士兵去干件事情，从整个事情的角度来考虑，司令员的作用是，
     发出口令，口令经过传递，传到了士兵耳朵里，士兵去执行。
     这个过程好在，三者相互解耦，任何一方都不用去依赖其他人，只需要做好自己的事儿就行，司令员要的是结果，
     不会去关注到底士兵是怎么实现的。
     命令模式的目的就是达到命令的发出者和执行者之间解耦，实现请求和执行分开.
     */
}
