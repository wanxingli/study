package com.studyspringboot.studyspringboot.designPattern.dp.create.factory.method;

/**
 * 工厂实现该接口，返回具体的实例对象
 * 
 * 作者: zhoubang 
 * 日期：2015年10月26日 下午5:18:17
 */
public interface Provider {

    public Sender produce();
}
