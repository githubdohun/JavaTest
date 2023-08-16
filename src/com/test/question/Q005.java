package com.test.question;

import java.util.Scanner;

public class Q005 {
	public static void main(String[] args) {
		
		//자전거가 있다. 자전거의 바퀴는 지름(직경)이 26인치이다. 사용자가 페달을 밟은 횟수를 입력하면 자전거가 총 몇 m를 달렸는지 출력하시오.
		
		Scanner scan = new Scanner(System.in);
		
		int count = 0;
		double gearRatio = 0;
		double distance = 0;
		
		System.out.print("사용자가 페달을 밟은 횟수: ");
		count = scan.nextInt();
		
		gearRatio = 3.14 * 26 * 0.0254;
		
		distance = count * gearRatio;
		
		System.out.printf("사용자가 총 %d회 페달을 밟아 자전거가 총 %,.3fm를 달렸습니다.\n", count, distance  );
		
		
		
		
	}

}
