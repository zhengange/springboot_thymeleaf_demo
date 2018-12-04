package com.example.demo.bean;

import org.apache.commons.logging.LogFactory;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * Created by zhenganyi on 2017/8/16.
 */
public class LoggerFactory {
  private static Logger logger = null;
  private static int hasInitialized = 0;

  public static Logger getLogger() {
    if (hasInitialized == 0) {
      synchronized (LoggerFactory.class) {
        if (logger == null) {
          logger = LogManager.getLogger(LogFactory.class.getName());
          hasInitialized = 1;
        }
      }
    }
    return logger;
  }
}
