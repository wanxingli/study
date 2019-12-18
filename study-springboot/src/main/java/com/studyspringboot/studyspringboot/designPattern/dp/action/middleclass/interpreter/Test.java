package com.studyspringboot.studyspringboot.designPattern.dp.action.middleclass.interpreter;

/**
 * 解释器模式
 */
public class Test {

    public static void main(String[] args) {

        // 计算9+2-8的值
        int result = new Minus().interpret((new Context(new Plus().interpret(new Context(9, 2)), 8)));
        System.out.println(result);
    }

    /**
     *
     解释器模式用来做各种各样的解释器，如正则表达式等的解释器等等
     */
}