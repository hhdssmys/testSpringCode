package com.generalichina.aoptest;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {
	//@annotation 这个表达式只能针对方法
	//次处表示拦截所有使用该注释的地方
	// 限制匹配到连接点的主题，其中连接点的主题（在Spring AOP中执行的方法）具有给定的注释(来源于stackoverflow)
	@Pointcut("@annotation(com.generalichina.aoptest.Action)")
	public void annotationPointCut(){}
	
	@After("annotationPointCut()")
	public void after(JoinPoint joinPoint){
		MethodSignature signature = (MethodSignature) joinPoint.getSignature();
		Method method = signature.getMethod();
		Action action = method.getAnnotation(Action.class);
		System.out.println("注解式拦截"+action.name());
	}
	
	
	@Before("execution(* com.generalichina.aoptest.DemoMethodService.*(..))")
	public void before(JoinPoint joinPoint){
		MethodSignature signature = (MethodSignature) joinPoint.getSignature();
		Method method = signature.getMethod();
		System.out.println("方法规则式拦截"+method.getName());
	}
}
