package com.studyspringboot.studyspringboot.designPattern.dp.create.prototype;

//摘自：http://www.cnblogs.com/huzi007/p/3884994.html


/**
 * 实现一个克隆自身的操作
 * 
 * 作者: zhoubang 
 * 日期：2015年10月27日 下午3:58:51
 */
public class ConcretePrototypeShallowCopy extends PrototypeShallowCopy {
    
    public ConcretePrototypeShallowCopy(String name) {
        setName(name);
    }
}
