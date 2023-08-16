package com.test.question.Q100;

public class Packer {

	private static int pencilCount = 0;
	private static int eraserCount = 0;
	private static int ballPointPenCount = 0;
	private static int rulerCount = 0;
	
	public  void packing(Pencil pencil) {
		pencilCount++;
		System.out.println("연필을 검수하고 포장합니다" + pencil.info());
	}
	
	public void packing(Eraser eraser) {
		eraserCount++;
		System.out.println("지우개를 검수하고 포장합니다" + eraser.info());
	}
	
	public void packing(BallPointPen ballPointPen) {
		pencilCount++;
		System.out.println("볼펜을 검수하고 포장합니다" + ballPointPen.info());
	}
	
	public void packing(Ruler ruler) {
		pencilCount++;
		System.out.println("자를 검수하고 포장합니다" + ruler.info());
	}
	
	
	
	
	
}
