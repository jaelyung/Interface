package com.human.interfaceEx;

public class TV extends Controller{
	public boolean power;
	TV(boolean power){
		this.power=power;
	}
	public void show() {
		if(power==true) {
			System.out.println(getName()+"�� �������ϴ�.");
		}else {
			System.out.println(getName()+"�� �������ϴ�.");
		}
	}
	@Override
	public String getName() {
		String returnValue="TV";
		return returnValue;
	}
}
