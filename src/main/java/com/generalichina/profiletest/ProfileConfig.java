package com.generalichina.profiletest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class ProfileConfig {
	@Bean
	@Profile("dev")
	public DemoBean devDemoBean(){
		return new DemoBean("from development profile");
	}
	@Bean
	@Profile("prod1")
	public DemoBean prodDemoBean1(){
		return new DemoBean("from product profile1");
	}
	@Bean
	@Profile("prod")
	public DemoBean prodDemoBean(){
		return new DemoBean("from product profile");
	}
}
