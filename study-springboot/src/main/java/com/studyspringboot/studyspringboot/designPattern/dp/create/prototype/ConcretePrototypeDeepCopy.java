package com.studyspringboot.studyspringboot.designPattern.dp.create.prototype;

/**
 * 实现一个克隆自身的操作
 * 
 * 作者: zhoubang 日期：2015年10月27日 下午3:58:51
 */
public class ConcretePrototypeDeepCopy extends PrototypeDeepCopy {

    private static final long serialVersionUID = 1L;

    public ConcretePrototypeDeepCopy(String name, String sexName) {
        setName(name);
        setObj(new SerializableObject(sexName));
    }
}
