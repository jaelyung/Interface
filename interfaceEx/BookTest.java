package com.human.interfaceEx;

import java.util.Arrays;
import java.util.Comparator;

public class BookTest {

	public static void main(String[] args) {
		Book [] books = { new Book(15000), new Book(50000),  new Book(20000)};
		for(int i=0;i<books.length;i++) {
			System.out.println(books[i]);
		}
		
		System.out.println("--------------------");
		//Book 클래스 안에서 메소드로 정렬
		Arrays.sort(books);
		//BookText 클래스 안에서 main안에서 익명클래스로 정렬
		Arrays.sort(books,new Comparator<Book>() {

			@Override
			public int compare(Book o1, Book o2) {
				int returnValue=0;
				if(o1.price>o2.price) {
					returnValue=1;
				}else if(o1.price<o2.price) {
					returnValue=-1;
				}else {
					
				}
				return returnValue;
			}
			
		});
		for(int i=0;i<books.length;i++) {
			System.out.println(books[i]);
		}
	}

}
