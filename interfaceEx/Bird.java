package com.human.interfaceEx;

public class Bird extends Countable{
	Bird(String name, int num) {
		super(name, num);
	}
	void fly() {
		System.out.println(num+"���� "+name+"�� ���ư���.");
	}
	@Override
	void count() {
		System.out.println(name+"�� "+num+"���� �ִ�.");
	}
}
