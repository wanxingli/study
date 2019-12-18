package com.studyspringboot.studyspringboot.designPattern.dp.action.middleclass.interpreter;

/**
 * 计算的接口
 * 
 * 作者: zhoubang 
 * 日期：2015年10月29日 上午10:12:18
 */
public interface Expression {
    public int interpret(Context context);
}