package com.test.question.Q100;

public class Ruler {

	private int length;
	private String shape;
	
	
	public void setLength(int length) {
		this.length = length;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	
	public String info() {
		
		return "자 길이: " + this.length + "자 형태: " + this.shape;
				
	}
	
}
