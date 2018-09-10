package com.generalichina.aoptest;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.generalichina.aoptest")
@EnableAspectJAutoProxy
public class AopConfig {

}
