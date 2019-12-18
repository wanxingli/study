package com.studyspringboot.studyspringboot.designPattern.dp.structure.bridge;

/**
 * 桥接模式
 */
public class Test {
    
    /**
     * 联系JDBC的连接，来理解该方法调用
     */
    public static void main(String[] args) {
        
        //相当于驱动管理器，DriverManager
        Bridge bridge = new MyBridge();

        
        /*mysql驱动的实现*/
        JdbcInterface mysqldriver = new MysqlDriver();
        
        //设置mysql的数据库连接驱动
        bridge.setSource(mysqldriver);
        
        //连接mysql数据库
        bridge.connect();

        
        
        //===============================================================================================================
        
        
        
        /*oracle驱动的实现*/
        JdbcInterface oracledriver = new OracleDriver();
        
        //设置oracle的数据库连接驱动
        bridge.setSource(oracledriver);
        
        //连接oracle数据库
        bridge.connect();
    }

    /**
     * 
     * 这样，就通过对Bridge类的调用，实现了对接口JdbcInterface的实现类MysqlDriver和OracleDriver的调用。
     * 
     *
     桥接模式就是把事物和其具体实现分开，使他们可以各自独立的变化。

     桥接的用意是：将抽象化与实现化解耦，使得二者可以独立变化，像我们常用的JDBC桥DriverManager一样，JDBC进行连接数据库的时候，在各个数据库之间进行切换，基本不需要动太多的代码，甚至丝毫不用动，
     原因就是JDBC提供统一接口，每个数据库提供各自的实现，用一个叫做数据库驱动的程序来桥接就行了。

     */
}
