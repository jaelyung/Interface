package com.human.interfaceEx;

public class TalkableTest {
	public static void speak(String s) {
		System.out.println(s);
	}
	public static void main(String[] args) {
		speak((new Korean()).talk());
		speak((new American()).talk());

	}

}
