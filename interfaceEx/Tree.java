package com.human.interfaceEx;

public class Tree extends Countable {
	Tree(String name, int num){
		super(name, num);
	}
	void ripen() {
		System.out.println(this.num+"�׷� "+this.name+"�� ���Ű� �� �;���.");
	}
	@Override
	void count() {
		System.out.println(this.name+"�� "+this.num+"�׷� �ִ�.");
	}
}
