package com.human.interfaceEx;

public class CountableTest {

	public static void main(String[] args) {
		Bird b1=new Bird("���ٱ�",5);
		Bird b2=new Bird("������",2);
		Tree t1=new Tree("�������",10);
		Tree t2=new Tree("�㳪��",7);
		
		Countable []m= {new Bird("���ٱ�",5), new Bird("������",2), new Tree("�������",10), new Tree("�㳪��",7)};
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
