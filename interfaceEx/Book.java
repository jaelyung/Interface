package com.human.interfaceEx;

public class Book implements Comparable{
	int price;

	public Book(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [price=" + price + "]";
	}

	@Override
	public int compareTo(Object o) {
		//-1==��ȯ�ʿ�,  0==����, 1==��ȯ�ʿ����
		int price=0;
		int returnValue=0;
		Book other=(Book) o;
		if(this.price==other.price) {
			returnValue=0;
		}else if(this.price>other.price){
			returnValue=1;
		}else if(this.price<other.price) {
			returnValue=-1;
		}
		return returnValue;
	}
	
}
