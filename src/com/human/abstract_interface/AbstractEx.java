package com.human.abstract_interface;

public abstract class AbstractEx {
	int num;
	String str;
	
	public AbstractEx() {
		System.out.println("AbstractClassEx constructor");
	}
	
	public AbstractEx(int i, String s) {
		System.out.println("AbstractEx constructor");
		this.num=i;
		this.str=s;
	}
	
	public void fun1() {
		System.out.println("-- fun1() START --");
	}
	public abstract void fun2();
}
