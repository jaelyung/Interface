package com.human.abstract_interface;
//접근제한자 public, private, default, protected
//public 모든 위치에서 접근가능
//private 같은 클래스 내부에서 접근가능
//default 같은 패키지에서 접근가능
//protected 상속받은 자식에서만 접근가능

public class Test {

	public static void main(String[] args) {
		MyClass mc=new MyClass();
		mc.i1=1;
		// 접근 제한자 private mc.i2=1;
		mc.i3=1;
		mc.i4=1;
		
	}

}
