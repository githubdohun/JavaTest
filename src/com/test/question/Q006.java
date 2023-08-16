package com.test.question;

import java.util.Scanner;

public class Q006 {

	public static void main(String[] args) {
		
		//사용자의 한달 수입을 입력받아 세후 금액을 출력하시오.
		
		Scanner scan = new Scanner(System.in);
		
		int income = 0;
		double afterTax = 0;
		double tax = 0;
		
		System.out.print("한달 수입 금액: ");
		income = scan.nextInt();
		
		tax = income * 0.033;
		System.out.printf("세금(원): %,.0f원\n", tax );
		
		afterTax = income - tax;
		System.out.printf("세후 금액(원): %,.0f원\n", afterTax);
		
		
		
		
	}
}
