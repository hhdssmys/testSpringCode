package com.generalichina.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<User> uList = new ArrayList<>();
		UserFactory userFactory = UserFactory.getInstance();
		uList.add(userFactory.createUser("张三", 18));
		uList.add(userFactory.createUser("王五", 16));
		uList.add(userFactory.createUser("李四", 17));
		System.out.println(uList);
//		Collections.sort(uList, new UserCompare());
		Collections.sort(uList, (o1,o2)-> o1.getAge()-o2.getAge());

		System.out.println(uList);
	}
}
