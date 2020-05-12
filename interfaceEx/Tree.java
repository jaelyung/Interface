package com.human.interfaceEx;

public class Tree extends Countable {
	Tree(String name, int num){
		super(name, num);
	}
	void ripen() {
		System.out.println(this.num+"그루 "+this.name+"에 열매가 잘 익었다.");
	}
	@Override
	void count() {
		System.out.println(this.name+"가 "+this.num+"그루 있다.");
	}
}
