package com.test.question;

import java.util.Scanner;

public class Q049 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("행: ");
		int width = scan.nextInt();
		
		for (int i=0; i<width; i++) {
			
			for (int j=0; j < i; j++) {
			
				System.out.print(" "); // 왼쪽부터 늘어나는 공백 구현
			}
			for (int j = width; j > i; j--)
			System.out.print("*");
			System.out.println();
		}
		

	}
	

}
