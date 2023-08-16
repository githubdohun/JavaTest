package com.test.question;

import java.util.Scanner;

public class Q044 {
	
	public static void main(String[] args) {
		
		int num = 0;
		int sum = 0;
		String txt = "";
		
		
		Scanner scan = new Scanner(System.in);
		
		for (;;) {
			
			System.out.print("숫자: ");
			num = scan.nextInt();
			
			if (num % 2 == 0) {
				
				sum = sum + num;
				txt = txt + " + " + num;
				
			} else {
				sum = sum - num;
				txt = txt + " - " + num;
			}
			
			if (sum >= 100) {
				break;
			}
		
		}
		
		System.out.println(txt + " = " + sum);
		
	}

}
