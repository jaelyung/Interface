package com.human.play;
import java.util.Scanner;

import com.human.character.Character;
import com.human.character.Pikachu;
public class MakeCharacter {
	public Character selectCharacter() {
		Character returnValue=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("ĳ���͸� �����ϼ���.");
			System.out.println("1.��ī��");
			String ch=sc.nextLine();
			if(ch.equals("1")) {
				returnValue=new Pikachu();
			}
		return returnValue;
	}
}
