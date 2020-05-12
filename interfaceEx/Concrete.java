package com.human.interfaceEx;

public class Concrete extends Abstract{
	int j;
	Concrete(){}
	Concrete(int i,int j){
		super.i=i;
		this.j=j;
	}
	void show() {
		System.out.println("i = "+i+", j = "+j);
	}
}


