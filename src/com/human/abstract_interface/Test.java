package com.human.abstract_interface;
//���������� public, private, default, protected
//public ��� ��ġ���� ���ٰ���
//private ���� Ŭ���� ���ο��� ���ٰ���
//default ���� ��Ű������ ���ٰ���
//protected ���� ��Ű���̰ų� �ٸ���Ű���� ��ӹ��� �ڽĿ����� ���ٰ���
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
		// ���� ������ private mc.i2=1;
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
