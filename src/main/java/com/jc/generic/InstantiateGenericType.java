package com.jc.generic;

/**
 * 既然ClassTypeCapture这个例子展示了对instance of的补偿。那这个例子则展示对创建对象new的补偿，引入一个工厂对象即可
 * @author jevoncode
 */
class ClassAsFactory<T> {
	T x;

	public ClassAsFactory(Class<T> kind) {
		try {
			x = kind.newInstance();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}

class Employee {
}

public class InstantiateGenericType {
	public static void main(String[] args) {
		ClassAsFactory<Employee> fe = new ClassAsFactory<Employee>(Employee.class);
		System.out.println("ClassAsFactory<Employee> succeeded");
		try {
			ClassAsFactory<Integer> fi = new ClassAsFactory<Integer>(Integer.class);
		} catch (Exception e) {
			System.out.println("ClassAsFactory<Integer> failed");
		}
	}
}