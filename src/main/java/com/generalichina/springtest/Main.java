package com.generalichina.springtest;


import java.util.logging.Logger;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		Logger logger = Logger.getAnonymousLogger();
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);
		UseFunctionService	useFunctionService = context.getBean(UseFunctionService.class);
		logger.info("Log this:"+useFunctionService.sayHello("brother"));
		context.close();
		
	}
}
