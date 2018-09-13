package com.generalichina.inittest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.generalichina.inittest")
public class PrePostConfig {
	@Bean
	JSR250WayService jsr250WayService(){
		return new JSR250WayService();
	}
	@Bean(initMethod="init",destroyMethod="destroy")
	BeanWayService beanWayService(){
		return new BeanWayService();
	}
	
}
