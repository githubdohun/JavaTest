package com.test.question;

import java.util.Scanner;

public class Q003 {
	public static void main(String[] args) {
		
		//사각형의 너비와 높이를 입력받아 넓이와 둘레를 출력하시오.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("너비: ");
		int width = 0;
		width = scan.nextInt();

		System.out.println("높이: ");
		int height = 0;
		height = scan.nextInt();
		
		int area = 0;
		area = width * height;
		
		int round = 0;
		round = width * 2 + height * 2;
		
		System.out.println("사각형의 넓이는: " + area + "cm입니다.");
		System.out.println("사각형의 둘레는: " + round + "cm입니다.");
		
		
		
	}

}
