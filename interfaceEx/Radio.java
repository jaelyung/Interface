package com.human.interfaceEx;

public class Radio extends Controller{
	public boolean power;
	Radio(boolean power){
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
		String returnValue="����";
		return returnValue;
	}

}
