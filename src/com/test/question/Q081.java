package com.test.question;

import java.util.Scanner;

public class Q081 {
	// 이메일 주소를 입력받아 아이디와 도메인을 각각 추출하시오.
	
	public static void main(String[] args) {
		
String email = "";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이메일 : ");
		email = scan.nextLine();
		
		
		int index = email.lastIndexOf("@");
		
		
		String id = email.substring(0, index);
		
		System.out.println("아이디: " + email);
		
		
		
		
		String domain = email.substring(index + 1);
		
		System.out.println("도메인: " +  domain); //도메인
		
		
		
	}

}
