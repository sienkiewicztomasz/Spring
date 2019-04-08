package com.allegro.trade.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class IndexAOP {

    Logger logger = Logger.getRootLogger();

    @After("execution(* com.allegro.trade.controllers.IndexController.index(..))")
    public void visitMainPage(JoinPoint jointPoint) {
        logger.info("Someone enters main page");
    }
}
