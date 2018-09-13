package com.generalichina.inittest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PrePostConfig.class);
		//BeanWayService beanWayService = context.getBean(BeanWayService.class);
		//JSR250WayService jsr250WayService = context.getBean(JSR250WayService.class);
		/**
		 * spring负责javabean的创建与销毁,先初始化的后销毁（C++的类似于析构函数）,
		 * bean之间的先后构造依据配置声明顺序
		 * 该过程具有幂等性
		 */
		context.close();
	}
}
