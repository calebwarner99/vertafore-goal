package com.vertafore.aspectorientedapp.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);

    @Before("execution(* com.vertafore.aspectorientedapp.service.ShapeService.*(..))")
    public void logService() {
        LOGGER.info("Service is being called");
    }
}
