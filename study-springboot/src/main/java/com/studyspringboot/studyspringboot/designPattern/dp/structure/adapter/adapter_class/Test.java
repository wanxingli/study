package com.studyspringboot.studyspringboot.designPattern.dp.structure.adapter.adapter_class;

public class Test {

    public static void main(String[] args) {
        Targetable target = new Adapter();
        
        target.method1();
        target.method2();
        
        
        /**
         * 
         * 这样 Targetable 接口的实现类就具有了 Source 类的功能。
         * 
         */
    }

}
