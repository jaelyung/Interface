package com.human.abstract_interface;

public class ClassEx extends AbstractEx {
	public ClassEx() {
		System.out.println("ClassEx constructor");
	}

	public ClassEx(int i, String s) {
		super(i,s);
	}
	@Override
	public void fun2() {
		System.out.println("-- fun2() START --");
	}
	
	
	public static void main(String[] args) {
		AbstractEx ex=new ClassEx(10, "java");
		ex.fun1();
		ex.fun2();

	}

}