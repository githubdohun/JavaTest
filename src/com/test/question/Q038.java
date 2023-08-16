package com.test.question;

import java.util.Scanner;

public class Q038 {
	public static void main(String[] args) {
		
		int num = 0;
		int count = 0;
		int odd = 0;
		int even = 0;
		int oddSum = 0;
		int evenSum = 0;
		
		
		Scanner scan = new Scanner(System.in);
	
		System.out.print("입력 횟수: ");
		count = scan.nextInt();
		
		for (int i=1; i <= count; i++) {
			System.out.print("숫자: ");
			num = scan.nextInt();
		
			
		
		if ( num % 2 == 0) {
			even++;
			evenSum = evenSum + num;
			} else {
				odd++;
				oddSum = oddSum + num;
			}
	}
		
		System.out.printf("짝수 %d개의 합: %d\n", even, evenSum);
		System.out.printf("홀수 %d개의 합: %d", odd, oddSum);
		
	}
}
