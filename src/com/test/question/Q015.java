package com.test.question;

import java.util.Scanner;

public class Q015 {

	//사과 나무가 있다. 사과 나무 씨앗을 심을 날로부터 특정 시간이 흘렀을 때 사과 총 몇개가 열리는지 구하는 메소드를 선언하시오.
	
	public static void main(String[] args) {
		int apple = 0;
		int sunny = 0;
		int foggy = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("맑은 날: ");
		sunny = scan.nextInt();
		
		System.out.print("흐린 날: ");
		foggy = scan.nextInt();
		
		apple = getApple(sunny, foggy);
		System.out.printf("사과가 총 %d개 열렸습니다\n", apple);
		
	}

	private static int getApple(int sunny, int foggy) {
	
		int tree = 0;
		int apple = 0;
		
		tree = sunny * 5 + foggy * 2;
		
		apple = tree >= 100 ? (tree - 100) / 10 : 0; 
		
		return apple;
		
		
	}
}
