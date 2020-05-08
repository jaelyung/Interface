package com.human.play;
import java.util.Scanner;

import com.human.character.Character;
import com.human.character.Pikachu;
//import ���ϸ� java.lang�� Character�� ����ϰԵǴ� ����
public class PlayGame {
	private Character character;
	private boolean flag=true;
	private boolean characterFlag=true;
	public void play(Character c) {
		character=c;
		Scanner sc=new Scanner(System.in);
		
		while(flag) {
			character.printInfo();
			System.out.println("1.����̱�  2.����  3.����ֱ�  4.�Ʒ�  5.����");
			System.out.println("�Է�>>");
			String select=sc.nextLine();
			switch(select) {
			case "1":
				character.eat();
				break;
			case "2":
				character.sleep();
				break;
			case "3":
				character.play();
				break;
			case "4":
				character.train();
				break;
			case "5":
				flag=false;
				break;
			default:
				break;
			}
			character.levelUp();
			if(flag==true) {
				flag=character.endGame();
				character.caution();
			}
		}
		
	}
}
