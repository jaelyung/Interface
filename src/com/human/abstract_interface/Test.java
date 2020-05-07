package com.human.abstract_interface;
//접근제한자 public, private, default, protected
//public 모든 위치에서 접근가능
//private 같은 클래스 내부에서 접근가능
//default 같은 패키지에서 접근가능
//protected 같은 패키지이거나 다른패키지면 상속받은 자식에서만 접근가능
class MyClass2 extends com.human.ex1.MyClass{
	public void test() {
		i1=1;
//		i2=1;
//		i3=1;
		i4=1;
		
	}
}
public class Test {

	public static void main(String[] args) {
		com.human.abstract_interface.MyClass mc=new com.human.abstract_interface.MyClass();
		mc.i1=1;
		// 접근 제한자 private mc.i2=1;
		mc.i3=1;
		mc.i4=1;
		
		com.human.ex1.MyClass mc2=new com.human.ex1.MyClass();
		mc2.i1=1;
//		mc2.i2=1;
//		mc2.i3=1;
//		mc2.i4=1;
//		
	}

}
