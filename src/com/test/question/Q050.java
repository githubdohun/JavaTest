package com.test.question;

import java.util.Scanner;

public class Q050 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("행: ");
		int line = scan.nextInt();
		
		
		for (int i = 1; i < line + 1; i++) { 
			
			for (int j= line; j > i; j--) {
			
				System.out.print(" "); // 왼쪽부터 늘어나는 공백 구현
				
			}
			for (int j = 0; j < i; j++) { //열 만들기
				
				System.out.print("*");
				
				
			}
			System.out.println();
		}	
		
	}
		
}

