package com.generalichina.lambda;

import java.util.Comparator;

public class UserCompare implements Comparator<User>{
	/**
	 * 返回正数，零，负数各代表大于，等于，小于
	 */
	@Override
	public int compare(User u1, User u2) {
		return u1.getAge()-u2.getAge();
	}

}
