package com.test.java.obj;

public class Ex49_static {
	
	public static void main(String[] args) {
		
		//요구사항
		//1. 펜을 생성하시오.
		//2. 생산된 펜의 개수를 세시오.
		
		//case 1.
		// - Pen 객체(클래스)와 count 간의 관계 약함.
		// - 오차 발생(count++ 누락)
		
		//int count = 0;
//		Pen p1 = new Pen("Monami", "Black");
//		count++;
//		
//		Pen p2 = new Pen("Monami", "Black");
//		
//		
//		Pen p3 = new Pen("Monami", "Black");
//		count++;
//		
//		System.out.printf("팬 개수: %d",  count);
		
		//case 2.
		// - Pen과 count간의 결합 > 강하게
		// - 객체 변수 > 여러개 발생
		// - 그 중 1개 사용 > 왜 그 객체의 count 사용하는지? 당위성(x)
		
//		Pen p1 = new Pen("Monami", "Black");
//		p1.count++;
//		
//		Pen p2 = new Pen("Monami", "Black");
//		p1.count++;
//		
//		Pen p3 = new Pen("Monami", "Black");
//		p1.count++;
//		
//		System.out.printf("팬 개수: %d",  p1.count);
		
		//case 3.
		// - Pen과 count간의 결합 > 강하게
		// - count 변수 딱 1개 만들기
		
//		Pen p1 = new Pen("Monami", "Black");
//		Pen.count++;
//		
//		Pen p2 = new Pen("Monami", "Black");
//		Pen.count++;
//		
//		Pen p3 = new Pen("Monami", "Black");
//		Pen.count++;
//		
//		System.out.printf("팬 개수: %d",  Pen.count);

		//case 4.
		Pen p1 = new Pen("Monami", "Black");
		Pen p2 = new Pen("Monami", "Black");
		Pen p3 = new Pen("Monami", "Black");
		
		System.out.printf("팬 개수: %d",  Pen.count);
	}//main

}

class Pen {
	
	public static int  count = 0;
	
	private String model;
	private String color;
	
	public Pen(String model, String color) {
		
		this.model = model;
		this.color = color;
		Pen.count++;
		
		
	}

	@Override
	public String toString() {
		return "Pen [model=" + model + ", color=" + color + "]";
	}
	
	
}
