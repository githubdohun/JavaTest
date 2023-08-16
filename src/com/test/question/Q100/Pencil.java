package com.test.question.Q100;

public class Pencil {

	private String hardness;


	public void setHardness(String hardness) {
		this.hardness = hardness;
	} 
	
	public String getHardness() {
		return hardness;
	}

	public String info() {
		return "연필 등급: " + hardness;
	}
	
}

