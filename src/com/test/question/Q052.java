package com.test.question;

import java.util.Scanner;

public class Q052 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("행: ");
		
		int line = scan.nextInt();
		
		
		for (int i = 1; i <= line; i++) {
			
			for (int j = 0; j < line - i; j++) {
				System.out.print(" ");
			}
			
			char c = 'a';
			
			for (int j = 0 ; j < i  ; j++) {
				System.out.printf("%s", c);
				c++;
			}
			
			for (int j = 0 ; j < i  ; j++) {
				c--;
				System.out.printf("%s", c);
			}
			System.out.println();
			
		}
		
		
	}

}
