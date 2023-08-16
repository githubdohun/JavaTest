package com.test.question.Q100;

public class Eraser {
	private String size;

	public void setSize(String size) {
		this.size = size;
	}
	
	public String getSize() {
		return size;
	}

	public String info() {
		
		return "지우개 크기: " + this.size;
				
	}

}
