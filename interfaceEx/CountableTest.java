package com.human.interfaceEx;

public class CountableTest {

	public static void main(String[] args) {
		Bird b1=new Bird("뻐꾸기",5);
		Bird b2=new Bird("독수리",2);
		Tree t1=new Tree("사과나무",10);
		Tree t2=new Tree("밤나무",7);
		
		Countable []m= {new Bird("뻐꾸기",5), new Bird("독수리",2), new Tree("사과나무",10), new Tree("밤나무",7)};
		for(Countable e:m) {
			e.count();
		}
//		b1.count();
//		b2.count();
//		t1.count();
//		t2.count();
		b1.fly();
		b2.fly();
		t1.ripen();
		t2.ripen();
		

	}

}
