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
			System.out.println("피카츄 배부름");
		}else if(energy<30&&energy>0) {
			energy+=5;
		}
		if(energy>=100) {
			energy=100;
			System.out.println("피카츄: \"배불러!\" ");
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
			System.out.println("피카츄: \"안졸려!\" ");
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
			System.out.println("피카츄 Level Up!");
		}
	}

	@Override
	public boolean endGame() {
		boolean returnValue=true;
		if(level>4) {
			System.out.println("피카츄가 다 성장해서 용이 되었습니다.");
			returnValue=false;
		}else if(energy<0) {
			System.out.println("피카츄가 굶어 죽었습니다.");
			returnValue=false;
		}
		return returnValue;
	}

	@Override
	public void printInfo() {
		System.out.println("====================");
		System.out.println("피카츄 정보입니다.");
		System.out.println("experience: "+experience);
		System.out.println("energy: "+energy);
		System.out.println("level: "+level);
		System.out.println("====================");
	}

	@Override
	public void caution() {
		if(energy<30&&energy>0) {
			System.out.println("피카츄가 너무 지치고 배가 고픕니다...");
			System.out.println("피카츄: \"...zzz\" ");
		}
	}

}
