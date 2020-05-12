package com.human.interfaceEx;
interface Human{
	void eat();

	static void echo() {
		System.out.println("야호!!!");
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
		System.out.println("학생입니다.");
	}

	@Override
	public void eat() {
		System.out.println("도시락을 먹습니다.");
		
	}
}
class Worker implements Human{	
	public void eat() {
		System.out.println("빵을 먹습니다.");
	}
}
class Person implements Human, Print{

	@Override
	public void print() {
		System.out.println("인간입니다.");
		
	}

	@Override
	public void eat() {
		System.out.println("빵을 먹습니다.");
		
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
