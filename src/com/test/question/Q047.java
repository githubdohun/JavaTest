package com.test.question;

import java.util.Scanner;

public class Q047 {
	
	public static void main(String[] args) {
		
		for (;;) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("=======================");
		System.out.println("         자판기");
		System.out.println("=======================");
		System.out.println("1. 콜라		: 700원");
		System.out.println("2. 사이다		: 600원");
		System.out.println("3. 비타500	: 500원");
		System.out.println("------------------------");
		
		
		System.out.print("금액 투입(원): ");
		int money = scan.nextInt();
		
		System.out.println("------------------------");
		System.out.print("음료 선택(번호): ");
		
		int num = scan.nextInt();
		scan.skip("\r\n");
		
			
			if ( num == 1) {
				
				System.out.println("+콜라를 제공합니다.");
				System.out.printf("+잔돈 %d원을 제공합니다.\n", money - 700);
				System.out.println("계속하려면 엔터를 입력하세요.");
				scan.nextLine();	
			} else if (num == 2) {
				
				System.out.println("+사이다를 제공합니다.");
				System.out.printf("+잔돈 %d원을 제공합니다.\n", money - 600);
				System.out.println("계속하려면 엔터를 입력하세요.");
				scan.nextLine();	
				
			} else {
				
				
				System.out.println("+비타500를 제공합니다.");
				System.out.printf("+잔돈 %d원을 제공합니다.\n", money - 500);
				System.out.println("계속하려면 엔터를 입력하세요.");
				scan.nextLine();	
				
			}
				
				
		
		
	}

}
	
}
