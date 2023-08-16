package com.test.question;

import java.util.Scanner;

public class Q043 {
	
	public static void main(String[] args) {
		
		int userNumber = 0;
		int computerNumber = 0;
		
		System.out.println("컴퓨터가 1~10 사이의 숫자를 1개 생각했습니다.");
		computerNumber = ((int)(Math.random() * 10) + 1); //1 ~ 10
		
		Scanner scan = new Scanner(System.in);
		
		
		for (int i=0; i<10; i++){
		System.out.print("숫자: ");
		userNumber = scan.nextInt();
		
			if (userNumber == computerNumber) {
				System.out.println("맞았습니다.");
				break;
			} else {
				System.out.println("틀렸습니다.");
			
			}
		
		}
		
	}

}
