package com.generalichina.springtest2;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;

//@Service
public class UseFunctionService {
	
//	@Autowired
	private FunctionService functionService;
	
	public FunctionService getFunctionService() {
		return functionService;
	}

	public void setFunctionService(FunctionService functionService) {
		this.functionService = functionService;
	}

	public String sayHello(String word){
		return functionService.sayHello(word);
	}
}
