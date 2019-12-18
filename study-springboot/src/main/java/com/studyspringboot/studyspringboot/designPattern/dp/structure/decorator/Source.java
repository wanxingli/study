package com.studyspringboot.studyspringboot.designPattern.dp.structure.decorator;

/**
 * 被装饰类，实现 Sourceable 接口
 * 
 * 作者: zhoubang 日期：2015年10月28日 上午9:13:22
 */
public class Source implements Sourceable {

    @Override
    public void method() {
        System.out.println("执行被装饰类的方法...");
    }

}
