package com.training.aop.aopmadeeasy.advice;

import com.training.aop.aopmadeeasy.model.Animal;
import com.training.aop.aopmadeeasy.model.Mammal;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Aspect
@Component
public class DemoAspect {
    private Logger logger = LoggerFactory.getLogger(DemoAspect.class);

    @Pointcut("execution(public java.util.List<com.training.aop.aopmadeeasy.model.Animal> getAnimals())")
    private void getAnimals() {
    }

    @Pointcut("execution(public java.util.List<com.training.aop.aopmadeeasy.model.Animal+> getAnimals())")
    private void getAnimalsWithSubClass() {
    }

    @Pointcut("execution(public java.util.List<com.training.aop.aopmadeeasy.model.Animal> getAnimals(*))")
    private void getAnimalsWithParameter() {
    }

    @AfterReturning(pointcut = "getAnimals()", returning = "retVal")
    public void afterReturningAnimals(final JoinPoint jp, List<Animal> retVal) {
        String sourceMethod = jp.getSignature().getName();

        logger.info(String.format("*** Source method: %s", sourceMethod));
        retVal.forEach(item -> logger.info(String.format("*** I'm a %s and my name is %s", item.getType(), item.getName())));
    }

    @AfterReturning(pointcut = "getAnimalsWithSubClass()", returning = "retVal")
    public void afterReturningAnimalsWithSubclass(final JoinPoint jp, List<Mammal> retVal) {
        String sourceMethod = jp.getSignature().getName();

        logger.info(String.format("### Source method: %s", sourceMethod));
        retVal.forEach(item -> logger.info(String.format("### I'm a %s and my name is %s", item.getType(), item.getName())));
    }

    @AfterReturning(pointcut = "getAnimalsWithParameter()", returning = "retVal")
    public void afterReturningAnimalsWithFilter(final JoinPoint jp, List<Animal> retVal) {
        String sourceMethod = jp.getSignature().getName();

        logger.info(String.format("*#* Source method: %s", sourceMethod));
        retVal.forEach(item -> logger.info(String.format("*#* I'm a %s and my name is %s", item.getType(), item.getName())));
    }
}
