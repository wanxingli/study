package com.studyspringboot.studyspringboot.designPattern.dp.action.middleclass.interpreter;

/**
 * 用来计算的实现
 * 
 * 作者: zhoubang 
 * 日期：2015年10月29日 上午10:11:54
 */
public class Plus implements Expression {

    @Override
    public int interpret(Context context) {
        return context.getNum1() + context.getNum2();
    }
}