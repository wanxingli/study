package com.studyspringboot.studyspringboot.quartz;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Createc by lwx0y01 on 2019/12/16
 */
@Component
@EnableScheduling
public class QuartzDemo {

    /**
     * 间隔1分钟执行任务
     */
    @Scheduled(cron = "0 0/1 * * * ?")
    public void run(){
        // 逻辑代码
    }
}
