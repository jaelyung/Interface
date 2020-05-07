package com.human.abstract_interface;

public class ToyAirplane implements Toy{
	@Override
	public void walk() {
		System.out.println("The airplane can not walk.");
	}
	@Override
	public void run() {
		System.out.println("The airplane can not run");
	}
	@Override
	public void alarm() {
		System.out.println("The airplane has alarm function.");
	}
	@Override
	public void light() {
		System.out.println("The airplane has no light function.");
	}
	public static void main(String[] args) {
		Toy robot=new ToyRobot();
		Toy airplane=new ToyAirplane();
		
		Toy toys[] = {robot, airplane};
		
		for(int i=0; i<toys.length;i++) {
			toys[i].walk();
			toys[i].run();
			toys[i].alarm();
			toys[i].light();
			
			System.out.println();
		}

	}

}
