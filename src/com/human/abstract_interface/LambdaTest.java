package com.human.abstract_interface;

interface Inter1{
	 public void z();
}
interface Inter2{
	 public void z(int a);
}
interface Inter3{
	 public void z(int a,int b);
}

public class LambdaTest {

	 public static void main(String[] args) {
	  /*
	   ���� �޼ҵ� �ۼ�
	   ��ȯŸ��  �޼ҵ��̸�(�Ű�����){
	    �޼ҵ� ����
	   }
	   ���ٽ�  - ��ȯŸ�� ���� �޼ҵ��̸� ����
	   (�Ű�����)->{
	    �޼ҵ� ����
	   }
	   int sum(int a,int b){
	    return a+b;
	   }
	   (a,b)->{
	    return a+b;
	   }
	   
	   ��ȯ���� �ִ� ��� return, {},; ��������
	   (a,b)->a+b
	   
	   �Ϸ� ���� 1���̰� Ÿ���� �߷��� �� �ִ°��
	   () �� ���� ����
	   a->a+1
	   public int add(int a){
	    return a+1;
	   }
	   */
	  Inter1 a=()->System.out.println("Inter1");
	  a.z();
	  Inter2 b=b1->System.out.println("Inter2"+b1);
	  b.z(10);
	  Inter2 b2=(b1)->{
	   System.out.println("Inter2"+b1);
	  };
	  b2.z(11);
	  Inter3 b3=(a1,b1)->{
	   int x=a1+b1;
	   System.out.println(x);
	  };
	  b3.z(11, 21);
	  
	  


	 }

}