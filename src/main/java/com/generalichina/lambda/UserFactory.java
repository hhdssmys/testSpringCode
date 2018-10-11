package com.generalichina.lambda;

import java.util.logging.Logger;

public class UserFactory {
	private Logger logger = Logger.getLogger("UserFactory");
	private static UserFactory userFactory = new UserFactory() ;
	
	public User createUser(String name,int age) throws RuntimeException{
		if(name==null || name.isEmpty()){
			logger.info("请键入合理姓名");
			throw new RuntimeException("请键入合理姓名");//NullPointerException
			
		}
		if(age<=0){
			logger.info("请键入合理年龄值");
			throw new RuntimeException("请键入合理年龄值");
		}
		return new User(name,age);
	}
	public static UserFactory getInstance() throws RuntimeException{
		
		if(userFactory==null){
			userFactory = new UserFactory();
		}
		return userFactory;
	}
}
