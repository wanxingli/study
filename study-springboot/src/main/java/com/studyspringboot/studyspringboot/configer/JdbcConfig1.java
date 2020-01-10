package com.studyspringboot.studyspringboot.configer;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;


/**
 * created by scott on 1/8/20
 */
@Configuration
@PropertySource("classpath:jdbc.properties")
public class JdbcConfig1 {

    @Value("${jdbc.url}")
    String url;

    @Value("${jdbc.driverClassName}")
    String driverClassName;

    @Value("${jdbc.username}")
    String username;

    @Value("${jdbc.password}")
    String password;

    @Bean
    public DataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(url);
        dataSource.setUrl(driverClassName);
        dataSource.setUrl(username);
        dataSource.setUrl(password);
        return dataSource;
    }

}
