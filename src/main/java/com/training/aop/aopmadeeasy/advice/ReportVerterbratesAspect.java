package com.training.aop.aopmadeeasy.advice;

import com.training.aop.aopmadeeasy.model.Animal;
import com.training.aop.aopmadeeasy.model.Mammal;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Aspect
@Component
public class ReportVerterbratesAspect {
    private Logger logger = LoggerFactory.getLogger(ReportVerterbratesAspect.class);

    @Pointcut("execution(public java.util.List<com.training.aop.aopmadeeasy.model.Animal> getAnimals())")
    private void getAnimals() {
    }

    @Pointcut("execution(public java.util.List<com.training.aop.aopmadeeasy.model.Animal+> getAnimals())")
    private void getAnimalsWithSubClass() {
    }

    @Pointcut("within(com.training.aop.aopmadeeasy.model.Fish+)")
    private void getFishes(){ }

    @AfterReturning(pointcut = "getAnimals()", returning = "retVal")
    public void afterReturningAnimals(final JoinPoint jp, List<Animal> retVal) {
        String sourceMethod = jp.getSignature().getName();

        logger.info(String.format("*** Source method: %s", sourceMethod));
        retVal.forEach(item -> logger.info(String.format("*** I'm a %s and my name is %s",item.getType(), item.getName())));
    }

    @AfterReturning(pointcut = "getAnimalsWithSubClass()", returning = "retVal")
    public void afterReturningAnimalsWithSubclass(final JoinPoint jp, List<Mammal> retVal) {
        String sourceMethod = jp.getSignature().getName();

        logger.info(String.format("### Source method: %s", sourceMethod));
        retVal.forEach(item -> logger.info(String.format("### I'm a %s and my name is %s",item.getType(), item.getName())));
    }

    @Before(value = "getFishes()")
    public void beforeFishes(final JoinPoint jp) {
        logger.info("Fish!");
    }
}
