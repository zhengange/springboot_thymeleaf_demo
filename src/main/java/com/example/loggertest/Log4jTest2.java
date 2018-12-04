package com.example.loggertest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by zhenganyi on 2017/8/17.
 */
public class Log4jTest2 {
  static Logger log = LogManager.getLogger(Log4jTest2.class.getName());

  public void printLog() {
    log.info("This is an info log from Log4jTest2.");
    log.warn("This is a warn log from Log4jTest2.");
  }
}
