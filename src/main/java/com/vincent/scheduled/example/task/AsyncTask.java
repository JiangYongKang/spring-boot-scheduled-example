package com.vincent.scheduled.example.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * Author: vincent
 * Date: 2018-06-13 11:03:00
 * Comment: 异步任务
 */

@Component
public class AsyncTask {

    private static final Logger LOGGER = LoggerFactory.getLogger(AsyncTask.class);

    @Async
    public void doSomeHeavyBackgroundTask(int sleepTime) {
        LOGGER.info("开始执行: " + System.currentTimeMillis());
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        LOGGER.info("结束执行: " + System.currentTimeMillis());
    }

    @Async
    public void doSomeHeavyBackgroundTask() {
        LOGGER.info("开始执行: " + System.currentTimeMillis());
        try {
            Thread.sleep(1000 * 3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        LOGGER.info("结束执行: " + System.currentTimeMillis());
    }
}
