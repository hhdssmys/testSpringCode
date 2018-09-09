package com.generalichina.springtest2;

import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.generalichina.springtest")
public class JavaConfig {
	@Bean
	public FunctionService functionService(){
		return new FunctionService();
	}
	
/*	@Bean
	public UseFunctionService useFunctionService(){
		UseFunctionService useFunctionService =new UseFunctionService();
		useFunctionService.setFunctionService(functionService());
		return useFunctionService;
	}*/
	
	@Bean
	public UseFunctionService useFunctionService(FunctionService functionService){
		UseFunctionService useFunctionService =new UseFunctionService();
		useFunctionService.setFunctionService(functionService);
		return useFunctionService;
	}
}
