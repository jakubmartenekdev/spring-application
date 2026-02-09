package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Log {

    public <T> void logInfo(Class<T> application, String msg) {
        Logger logger = LoggerFactory.getLogger(application);
        logger.info(msg);
    }

    public void logInfo(String msg) {
        Logger logger = LoggerFactory.getLogger(DemoApplication.class);
        logger.info(msg);
    }
}
