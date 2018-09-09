package com.generalichina.springtest2;


import java.util.logging.Logger;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		Logger logger = Logger.getAnonymousLogger();
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		UseFunctionService	useFunctionService = context.getBean(UseFunctionService.class);
		logger.info("Log this:"+useFunctionService.sayHello("java config"));
		context.close();
		
	}
}
