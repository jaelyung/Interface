package com.human.interfaceEx;
interface Human{
	void eat();

	static void echo() {
		System.out.println("��ȣ!!!");
	}
}
interface Print{
	void print();
}
class Student implements Human, Print{
	public int number;
	public Student(int number) {
		this.number=number;
	}

	@Override
	public void print() {
		System.out.println("�л��Դϴ�.");
	}

	@Override
	public void eat() {
		System.out.println("���ö��� �Խ��ϴ�.");
		
	}
}
class Worker implements Human{	
	public void eat() {
		System.out.println("���� �Խ��ϴ�.");
	}
}
class Person implements Human, Print{

	@Override
	public void print() {
		System.out.println("�ΰ��Դϴ�.");
		
	}

	@Override
	public void eat() {
		System.out.println("���� �Խ��ϴ�.");
		
	}
	
}
public class HumanTest {

	public static void main(String[] args) {
		Human.echo();
		
		Student s=new Student(20);
		s.print();
		s.eat();
		
		Person p =new Person();
		p.print();
		p.eat();
	}

}
