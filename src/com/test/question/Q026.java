package com.test.question;

import java.util.Scanner;

public class Q026 {
	//학생의 국어 점수를 입력받아 성적을 출력하시오.
	
	public static void main(String[] args) {
		
		int sum = 0;
		String grade = "";
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수: ");
		sum = scan.nextInt();
		
		
		if(0 <= sum && sum <= 100) {
			
		if (sum >= 90) {
			grade = "A";
		} else if (sum >= 80) {
			grade = "B";
		} else if (sum >= 70) {
			grade = "C";
		} else if (sum >= 60) {
			grade = "D";
		} else { 
			grade = "F";
		}
		
		System.out.printf("입력한 %d점은 성적 %s입니다.", sum, grade);
		
	} else {
		System.out.println("점수가 올바르지 않습니다. 0~100사이의 값을 입력하시오.");
	}
		
	}
	

}
