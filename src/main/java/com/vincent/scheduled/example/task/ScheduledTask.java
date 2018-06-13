package com.vincent.scheduled.example.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Author: vincent
 * Date: 2018-06-13 10:48:00
 * Comment: 定时任务
 */

@Component
public class ScheduledTask {

    private static final Logger LOGGER = LoggerFactory.getLogger(ScheduledTask.class);

    @Scheduled(fixedRate = 1000 * 10)
    public void scheduledTask1() {
        LOGGER.info(System.currentTimeMillis() + " 每10秒都会执行一次: ");
    }

    @Scheduled(fixedDelay = 1000 * 10)
    public void scheduledTask2() {
        LOGGER.info(System.currentTimeMillis() + " 上一个计划任务执行完毕10秒后执行： ");
    }

    @Scheduled(initialDelay = 1000 * 10, fixedRate = 1000 * 10)
    public void scheduledTask3() {
        LOGGER.info(System.currentTimeMillis() + " 被调用后等待10秒后执行");
    }

    @Scheduled(cron = "0/5 * * * * *")
    public void scheduledTask4() {
        LOGGER.info(System.currentTimeMillis() + " 使用 cron 表达式，每隔5秒执行一次");
    }

    @Async
    @Scheduled(fixedRate = 1000 * 5)
    public void scheduledTask5() {
        LOGGER.info(System.currentTimeMillis() + " 异步定时任务，每隔5秒执行一次");
    }
}
