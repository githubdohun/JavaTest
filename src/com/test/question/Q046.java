package com.test.question;

import java.util.Scanner;

public class Q046 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num = 0;
		String sum = "";
		
		for (int i=0; i<10; i++) {
			
			System.out.print("숫자: ");
			num = scan.nextInt();
			
			sum += readNum(num);
		}
				
		System.out.println(sum);
		
		}

	private static String readNum(int num) {
		switch (num) {
		
		case 1:
			return "일";	
		case 2:
			return  "이";
		case 3:
			return  "삼";
		case 4:
			return  "사";
		case 5:
			return  "오";
		case 6:
			return  "육";
		case 7:
			return  "칠";
		case 8:
			return  "팔";
		case 9:
			return  "구";
		}
		return null;
	}
		
	}

		
	


