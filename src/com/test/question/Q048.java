package com.test.question;

import java.util.Scanner;

public class Q048 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자 입력:" );
		int num = scan.nextInt();
		
		int sum = 0;
		int oddSum = 0, evenSum = 0;
		
		
		for (;;) {
			
			if (num % 10 % 2 == 0) {
				evenSum += num % 10;
			} else {
				oddSum += num % 10;
			}
			
			
		//System.out.println(num % 10);
			
		sum += num % 10;
		num = num / 10;
		
			if (num ==0) {
				break;
			}
		}
		
		System.out.printf("홀수의 합: %d\n",oddSum);
		System.out.printf("짝수의 합: %d\n", evenSum);
	}

}
