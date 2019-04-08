package com.allegro.trade.aop;

import java.util.Arrays;
import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class ProductAOP {

    Logger logger = Logger.getRootLogger();

    @Before("execution(* com.allegro.trade.services.impl.ProductServiceImpl.deleteProduct(..))")
    public void beforeDeleteProduct (JoinPoint joinPoint) {
        logger.info("ProductController.deleteProduct(): " + joinPoint.getSignature().getName());
        Arrays.stream(joinPoint.getArgs()).forEach(logger::info);
    }
}
