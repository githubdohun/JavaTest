package com.test.question;

import java.util.Scanner;

public class Q037 {
	public static void main(String[] args) {
		
		int num = 0;
		int sum = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자: ");
		num = scan.nextInt();
		
		for(int i=1; i<=num; i++) {
			sum += i;
		}
		System.out.printf("1 ~ %d = %d ", num, sum);
	}

}
