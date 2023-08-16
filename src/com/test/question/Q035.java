package com.test.question;

import java.util.Scanner;

public class Q035 {

	public static void main(String[] args) {
		
		String name = "";
		int count = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름: ");
		name = scan.nextLine();
		
		System.out.print("횟수: ");
		count = scan.nextInt();
		
		for (int i=1; i<= count; i++) {
			System.out.printf("%s 님 안녕하세요.\n", name);
		}
		
		
		
		
	}
	
}
