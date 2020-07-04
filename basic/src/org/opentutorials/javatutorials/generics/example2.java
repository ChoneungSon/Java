package org.opentutorials.javatutorials.generics;

class Person2<T, S> {
	public T info;
	public S id;
	Person2(T info, S id) {
		this.info = info;
		this.id = id;
	}
	public <U> void printInfo(U info) {
		System.out.println(info);
	}
}

public class example2 {
	public static void main(String[] args) {
		Integer i = 1;
		EmployeeInfo e = new EmployeeInfo(10);
		Person2 p1 = new Person2(e, i);
		System.out.println(p1.info);
		System.out.println(p1.id);
		p1.<EmployeeInfo>printInfo(e);
	}
}
