package com.test.java;

import java.util.Scanner;

public class Ex16_Operator {
		public static void main(String[] args) {
			
			/*
			 
			 비교 연산자
			 - >, >=, <, <=, ==(equals), !=( not equals)
			 - 2항 연산자
			 - 피연산자들의 우위(동등) 비교하는 연산자
			 - 피연산자는 숫자형을 가진다.
			 - 연산의 결과가 항상 boolean형이다.
			 
			 */
			
			int a = 10;
			int b = 3;
			
			System.out.printf("%d > %d = %b\n",a, b, a > b);
			System.out.printf("%d >= %d = %b\n",a, b, a >= b);
			System.out.printf("%d < %d = %b\n",a, b, a < b);
			System.out.printf("%d <= %d = %b\n",a, b, a <= b);
			System.out.printf("%d == %d = %b\n",a, b, a == b);
			System.out.printf("%d != %d = %b\n",a, b, a != b);
			System.out.println();
			
			//사용자 나이 입력 > 19세 이상 통과, 미만 거절
			Scanner scan = new Scanner(System.in); // ctrl + shift + o
			
//			System.out.print("나이: ");
//			int age = scan.nextInt();
//			System.out.println(age >= 19); 
//			System.out.println();
		
			System.out.println('A'=='A');
			System.out.println('a'=='a');
			
			//비교 연산자
			//1. 모든 값형 > 안전
			//2. 문자열(참조형)의 비교 > 주의!
			
			String s1 = "홍길동";
			String s2 = "홍길동";
			String s3 = "아무개";
			String s4 = "홍";
			s4 = s4 + "길동";
			
			System.out.println(s4);
			
			//"홍길동" > "아무개"
			
			System.out.println(s1 == s2);
			System.out.println(s1 == s3);
			System.out.println(s1 == s4);
			
			//**** 문자열의 비교는 ==, != 연산자를 사용하면 절대 안 됨.
			// 	   문자열의 비교는 equals()메소드를 사용한다.
			
			System.out.println(s1.equals(s2)); //s1 == s2
			System.out.println(s1.equals(s3)); //s1 == s3
			System.out.println(s1.equals(s4)); //s1 == s4
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
}
