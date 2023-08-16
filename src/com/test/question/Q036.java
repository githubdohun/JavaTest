package com.test.question;

import java.util.Scanner;

public class Q036 {
	
	public static void main(String[] args) {
		
		int startNumber = 0;
		int endNumber = 0;
		int plus = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("시작 숫자: ");
		startNumber = scan.nextInt();
		
		System.out.print("종료 숫자: ");
		endNumber = scan.nextInt();
		
		System.out.print("증감치: ");
		plus = scan.nextInt();
		
		
		
		
		for (int i=startNumber; i<=endNumber; i = i + plus) {
			System.out.println(i);
			
		}
		
	}

}
