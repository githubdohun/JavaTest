package com.test.question;

import java.util.Scanner;

public class Q012 {
	
	//숫자를 전달하면 '짝수' 혹은 '홀수' 라는 단어를 반환하는 메소드를 선언하시오.
	
	public static void main(String[] args) {
		
		String result = "";
		int a = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자: ");
		a = scan.nextInt();
		
		result = getNumber(a);
		System.out.printf("입력하신 숫자 %d는 %s입니다.",a, result);
		
		
	}

	private static String getNumber(int a) {
		
		
		String result = "";
		
		result  = (a % 2 == 0) ? "짝수" : "홀수";
		
		return result;
		
		
		
	}

}
