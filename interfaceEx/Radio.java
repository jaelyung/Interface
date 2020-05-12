package com.human.interfaceEx;

public class Radio extends Controller{
	public boolean power;
	Radio(boolean power){
		this.power=power;
	}
	public void show() {
		if(power==true) {
			System.out.println(getName()+"가 켜졌습니다.");
		}else {
			System.out.println(getName()+"가 꺼졌습니다.");
		}
	}
	@Override
	public String getName() {
		String returnValue="라디오";
		return returnValue;
	}

}
