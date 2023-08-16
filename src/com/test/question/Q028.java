package com.test.question;

import java.util.Scanner;

public class Q028 {
	//근무 년수를 입력받아 아래와 같이 출력하시오.
	public static void main(String[] args) {
		
		String result = "";
		int year;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("근무 년수: ");
		year = scan.nextInt();
		
		
		if (year >= 1 ) {
		if (1 <= year && year <= 4 ) {
			System.out.printf("%d년차 초급 개발자입니다.\n", year);
			System.out.printf("앞으로 %d년 더 근무를 하면 중급 개발자가 됩니다\n", 5 - year);
		} else if (5 <= year && year <= 9 ) {
			System.out.printf("%d년차 중급 개발자입니다.\n", year);
			System.out.printf("당신은 %d년전까지 초급 개발자였습니다.\n", year - 4);
			System.out.printf("앞으로 %d년 더 근무를 하면 고급 개발자가 됩니다.\n", 10 - year);
		}  else if (10 <= year ) {
			System.out.printf("%d년차 고급 개발자입니다.\n", year);
			System.out.printf("당신은 %d년전까지 중급 개발자였습니다.\n", year - 10);
		} else {
			
		}
		
		
		} else {
			System.out.println("입력한 값이 올바르지 않습니다. 1이상의 값을 입력하시오.");
		}
	}

}
