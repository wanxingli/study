package com.studyspringboot.studyspringboot.designPattern.dp.create.factory.abstractfac;
/**
 * 具体产品类 B1，继承抽象类 Product
 * 
 * 作者: zhoubang 
 * 日期：2015年10月27日 上午10:33:21
 */
public class ProductB1 extends Product {

    @Override
    public void dosomething() {
        System.out.println("这里是产品B1");
    }

}