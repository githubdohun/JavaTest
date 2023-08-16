package com.test.question;

import java.util.Scanner;

public class Q029 {

	public static void main(String[] args) {
		
	int num1 = 0;
	int num2 = 0;
	String operator = "";
	
	Scanner scan = new Scanner(System.in);
	
	System.out.print("첫번째 숫자: ");
	num1 = scan.nextInt();
	
	System.out.print("두번째 숫자: ");
	num2 = scan.nextInt();
	scan.nextLine(); //skip
	
	System.out.print("연산자(+, -, *, /, %): ");
	operator = scan.nextLine();
	
	if (operator.equals("+")) {
		System.out.printf("%d %s %d = %d\n", num1, operator, num2, num1 + num2 );
	} else if (operator.equals("-")) {
		System.out.printf("%d %s %d = %d\n", num1, operator, num2, num1 - num2 );
	} else if (operator.equals("*")) {
		System.out.printf("%d %s %d = %d\n", num1, operator, num2, num1 * num2 );
	} else if (operator.equals("/")) {
		System.out.printf("%d %s %d = %.1f\n", num1, operator, num2, (double)num1 * num2 );
	} else if (operator.equals("%")) {
		System.out.printf("%d %s %d = %d\n", num1, operator, num2, num1 % num2 );
	} else {
		System.out.println("연산이 불가능합니다.");
	}
	
	
		
	}//main
}
