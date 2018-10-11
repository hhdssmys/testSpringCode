package com.generalichina.lambda;
/**
 * 
 * ━━━━━━南无阿弥陀佛━━━━━━
 *　　　┏┓　　　┏┓
 *　　┏┛┻━━━┛┻┓
 *　　┃　　　　　　　┃
 *　　┃　　　━　　　┃
 *　　┃　┳┛　┗┳　┃
 *　　┃　　　　　　　┃
 *　　┃　　　┻　　　┃
 *　　┃　　　　　　　┃
 *　　┗━┓　　　┏━┛
 *　　　　┃　　　┃stay hungry stay foolish
 *　　　　┃　　　┃Code is far away from bug with the animal protecting
 *　　　　┃　　　┗━━━┓
 *　　　　┃　　　　　　　┣┓
 *　　　　┃　　　　　　　┏┛
 *　　　　┗┓┓┏━┳┓┏┛
 *　　　　　┃┫┫　┃┫┫
 *　　　　　┗┻┛　┗┻┛
 * ━━━━━━萌萌哒━━━━━━
 * @ClassName: TestLambda.java
 * @Description: 
 * @author qsnp241
 * @date: 2018年10月11日 下午2:36:47
 *
 *
 *************分界线********************************
 *
 *注解@FunctionalInterface告诉编译器这是一个函数式接口,标识后明确了这个函数中
 *只有一个抽象方法，当你尝试在接口中编写多个方法的时候编译器将不允许这么干
 *
 *
 */
@FunctionalInterface
public interface TestLambda {
	public abstract void go();
//	public abstract void go2(); //@FunctionalInterface明确只有一个抽象方法
	
	/**
	 * 接口增强
	   	Java 8 对接口做了进一步的增强。
		a. 在接口中可以添加使用 default 关键字修饰的非抽象方法。即：默认方法（或扩展方法）
		b. 接口里可以声明静态方法，并且可以实现。
	 * 接口中的默认方法与静态方法，因为存在实现内容，就不在具有abstract
	 */
	default void go3(){
		/**
		 java8 允许给接口添加一个非抽象的方法实现，只需要使用 default 关键字即可，
		 这个特征又叫做扩展方法（也称为默认方法或虚拟扩展方法或防护方法）。
		 在实现该接口时，该默认扩展方法在子类上可以直接使用，
		 它的使用方式类似于抽象类中非抽象成员方法
		
		Note：扩展方法不能够重写（也称复写或覆盖） Object 中的方法，
		却可以重载Object 中的方法
		如果一个类实现了一个方法，那总是优先于接口的默认方法实现
		每一个java类都是Object的子类，
		也都继承了它类中的equals/hashCode/toString方法，
		那么在类的接口上包含这些默认方法是没有意义的，它们也从来不会被编译
		
		默认方法允许我们在接口里添加新的方法，而不会破坏实现这个接口的已有类的兼容性，
		也就是说不会强迫实现接口的类实现默认方法。
		
		默认方法和抽象方法的区别是抽象方法必须要被实现，默认方法不是。
		作为替代方式，接口可以提供一个默认的方法实现，
		所有这个接口的实现类都会通过继承得到这个方法（如果有需要也可以重写这个方法）

		
		 *
		 */
	}
	
	static void go4(){
		/**
		 *  is-a 继承, A is a B , B是A的父类
		    has-a 聚合(从属), A has a B, B就是A的组成部分。 
			like-a 组合, A like a B, B就是A的接口。 
		 * 
		 */
	}
}


class A implements TestLambda{

	@Override
	public void go() {
		System.out.println("接口中的默认方法和静态方法也不需要实现类必须重写");
	}

}