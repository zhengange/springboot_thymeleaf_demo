package com.example.loggertest;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by zhenganyi on 2017/8/17.
 */
public class Log4jTest {
  static Logger logger = LogManager.getLogger(Log4jTest.class.getName());

  public static void main(String args[]) {
    for (int i = 0; i < 50000; i++) {
      logger.trace("trace level");
      logger.debug("debug level");
      logger.info("info level");
      logger.warn("warn level");
      logger.error("error level");
      logger.fatal("fatal level");
    }
    try {
      Thread.sleep(1000 * 61);
    } catch (InterruptedException e) {
    }
    logger.trace("trace level");
    logger.debug("debug level");
    logger.info("info level");
    logger.warn("warn level");
    logger.error("error level");
    logger.fatal("fatal level");
    try {
      Thread.sleep(1000 * 61);
    } catch (InterruptedException e) {
    }
    logger.trace("trace level");
    logger.debug("debug level");
    logger.info("info level");
    logger.warn("warn level");
    logger.error("error level");
    logger.fatal("fatal level");
  }
}
