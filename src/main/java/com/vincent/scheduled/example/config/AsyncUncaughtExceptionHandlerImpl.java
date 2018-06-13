package com.vincent.scheduled.example.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;

import java.lang.reflect.Method;
import java.util.Arrays;


/**
 * Author: vincent
 * Date: 2018-06-13 11:32:00
 * Comment: 运行异步任务时候，抛出的异常都会由这里处理
 */

public class AsyncUncaughtExceptionHandlerImpl implements AsyncUncaughtExceptionHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(AsyncUncaughtExceptionHandlerImpl.class);

    @Override
    public void handleUncaughtException(Throwable exception, Method method, Object... params) {
        LOGGER.error("定时任务 " + method + "异常，参数: " + Arrays.toString(params), exception);
    }
}
