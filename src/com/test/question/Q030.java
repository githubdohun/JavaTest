package com.test.question;

import java.util.Scanner;

public class Q030 {
	// 영문자 1개를 입력받아 대/소문자 변환을 한 뒤 출력하시오.
	public static void main(String[] args) {
		
		char msg = '\0';
		
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("문자: ");
		msg = scan.nextLine().charAt(0);
		
		if ('a' <= msg && msg <= 'z') {
			System.out.printf("%c의 대문자는 %c입니다.",msg, msg - 32);
		} else if ('A' <= msg && msg <= 'Z') {
			System.out.printf("%c의 소문자는 %c입니다.",msg, msg + 32);
		} else {
			System.out.println("영문자만 입력하시오.");
		}
		
		
		
	}
}
