package com.test.question;

import java.util.Scanner;

public class Q011 {
	
	//숫자를 2개 입력받아 연산식을 반환하는 메소드를 선언하시오.
	
	public static void main(String[] args) {
		
		//숫자를 2개 입력받아 연산식을 반환하는 메소드를 선언하시오.
		String result;
		int n1 = 0;
		int n2 = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 숫자: ");
		n1 = scan.nextInt();
		
		System.out.print("두번째 숫자: ");
		n2 = scan.nextInt();
		
		add(n1, n2);
		result = add(n1,n2);
		System.out.println(result);
		
		subtract(n1,n2);
		result = subtract(n1, n2);
		System.out.println(result);
		
		multiply(n1, n2);
		result = multiply(n1, n2);
		System.out.println(result);
		
		divide(n1,n2);
		result = divide(n1, n2);
		System.out.println(result);
		
		mod(n1, n2);
		result = mod(n1, n2);
		System.out.println(result);
		
		
	}

	private static String mod(int n1, int n2) {
		
		String txt = "";
		int result = 0;
		
		result = n1 % n2;
		
		txt = (n1 + " % " + n2 + " = " + result);
		
		return txt;
		
	}

	private static String divide(int n1, int n2) {
		
		String txt = "";
		double result = 0;
		
		result = (double)n1 / n2;
		
		txt = String.format("%d / %d = %.1f",n1, n2, result);
		
		return txt;
		
		
	}

	private static String multiply(int n1, int n2) {
		
		String txt = "";
		int result = 0;
		
		
		result = n1 * n2;
		txt = n1 + " * " +  n2 + " = " + result;
		
		return txt;
		
		
		
		
	}

	private static String subtract(int n1, int n2) {
		
		String txt = "";
		int result = 0;
		
		
		
		result = n1 - n2;
		
		txt = n1 + " - " +  n2 + " = " + result;
		
		return  txt;
		
		
		
	}

	private static String add(int n1, int n2) {
		
		String txt = "";
		int result = 0;
		
		
		
		result = n1 + n2;
		
		txt = n1 + " + " +  n2 + " = " + result;
		
		return txt;
		
	}

}
