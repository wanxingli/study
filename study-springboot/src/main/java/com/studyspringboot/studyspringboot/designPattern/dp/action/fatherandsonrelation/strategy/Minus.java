package com.studyspringboot.studyspringboot.designPattern.dp.action.fatherandsonrelation.strategy;

/**
 * 数值相减
 * 
 * 作者: zhoubang 
 * 日期：2015年10月28日 下午4:21:09
 */
public class Minus extends AbstractCalculator implements ICalculator {

    @Override
    public int calculate(String exp) {
        int arrayInt[] = split(exp, "-");
        return arrayInt[0] - arrayInt[1];
    }

}