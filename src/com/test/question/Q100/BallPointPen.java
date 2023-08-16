package com.test.question.Q100;

public class BallPointPen {

	private double BallPointPen;
	private String color;
	
	
	public double getBallPointPen() {
		return BallPointPen;
	}
	
	public void setBallPointPen(double ballPointPen) {
		BallPointPen = ballPointPen;
	}




	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}
	
	public String info() {
		
		return "볼펜 심 두께 :" + this.BallPointPen + "mm, " + "색상: " + this.color; 
				
	}
}
