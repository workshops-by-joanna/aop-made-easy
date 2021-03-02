package com.training.aop.aopmadeeasy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class AopMadeEasyApplication {

	public static void main(String[] args) {
		SpringApplication.run(AopMadeEasyApplication.class, args);
	}

}
