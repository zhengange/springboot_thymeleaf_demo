package com.example.loggertest;


import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by zhenganyi on 2017/8/17.
 */

public class Hello {

  static Logger logger = LogManager.getLogger(Hello.class.getName());

  public boolean hello() {
    logger.trace("entry");
    logger.error("Did it again!");   //error级别的信息，参数就是你输出的信息
    logger.info("我是info信息");    //info级别的信息
    logger.debug("我是debug信息");
    logger.warn("我是warn信息");
    logger.fatal("我是fatal信息");
    logger.log(Level.DEBUG, "我是debug信息");   //这个就是制定Level类型的调用：谁闲着没事调用这个，也不一定哦！
    logger.trace("exit");
    return false;
  }
}