package com.human.character;

public class Pikachu implements Character {

	private int experience=0;
	private int energy=50;
	private int level=1;
	
	
	@Override
	public void eat() {
		if(energy>=30) {
			energy=energy+25;
		}else if(energy==100) {
			System.out.println("��ī�� ��θ�");
		}else if(energy<30&&energy>0) {
			energy+=5;
		}
		if(energy>=100) {
			energy=100;
			System.out.println("��ī��: \"��ҷ�!\" ");
		}
	}

	@Override
	public void sleep() {
		if(energy>=30) {
			energy+=10;
		}else if(energy<30&&energy>0) {
			energy+=5;
		}
		if(energy>=100) {
			energy=100;
			System.out.println("��ī��: \"������!\" ");
		}
	}

	@Override
	public void play() {
		energy-=30;
		experience+=30;
		if(experience>=100) {
			experience=100;
		}
	}

	@Override
	public void train() {
		energy-=20;
		experience+=20;
		if(experience>=100) {
			experience=100;
		}
	}

	@Override
	public void levelUp() {
		if(experience>=100) {
			experience=0;
			level++;
			System.out.println("��ī�� Level Up!");
		}
	}

	@Override
	public boolean endGame() {
		boolean returnValue=true;
		if(level>4) {
			System.out.println("��ī�� �� �����ؼ� ���� �Ǿ����ϴ�.");
			returnValue=false;
		}else if(energy<0) {
			System.out.println("��ī�� ���� �׾����ϴ�.");
			returnValue=false;
		}
		return returnValue;
	}

	@Override
	public void printInfo() {
		System.out.println("====================");
		System.out.println("��ī�� �����Դϴ�.");
		System.out.println("experience: "+experience);
		System.out.println("energy: "+energy);
		System.out.println("level: "+level);
		System.out.println("====================");
	}

	@Override
	public void caution() {
		if(energy<30&&energy>0) {
			System.out.println("��ī�� �ʹ� ��ġ�� �谡 ���Ŵϴ�...");
			System.out.println("��ī��: \"...zzz\" ");
		}
	}

}
