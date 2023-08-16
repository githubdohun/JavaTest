package com.test.java;

public class Ex15_Operator {
		public static void main(String[] args) {
			
			/*
			 
			 연산자, Operator
			 - 수학 연산자 > 대부분 > 프로그래밍 연산자
			 - 피연산자를 대상으로 미리 정해진 행동(연산)을 한 후에 행동(연산)의 결과를 반환하는 요소
			 - 주로 기호를 많이 사용 + 단어도 많이 사용
 			 1. 문장, statement
 			 2. 표현식, expression
 			 3. 연산자, operator
 			 4. 피연산자, operand
 			 5. 연산자 우선 순위
 			 6. 연산자 연산 방향
 			 
 			 문장 - 1개 이상의 표현식이 모여 문장을 만든다.
 			 - int sum = 10 + 20;
 			 
 			 표현식 - 문장을 구성하는 최소 단위 > 하나이 완성된 문장을 만들 수 있는 최소 표현
 			 - int sum
 			 - 10 + 20
 			 - sum = 30
 			 
 			 연산자 - +, =
 			 
 			 피연산자
			 - +: 10 + 20
			 - =: sum, 30
			 
			 연산자 우선 순위
			 - 하나의 문장에 속해 있는 연산자들 중 누가 먼저 실행하는지에 대한 규칙
			 - 1 + 2 * 3
			 
			 연산자 우선 방향
			 - 하나의 문장에 속해 있는 연산자들 중 우선 순위 동일하면 누가 먼저 실행하는지에 대한 규칙
			 - 대부분 왼쪽 > 오른쪽 방행
			 - 1 + 2 + 3
			 
			 연산자 종류
			 
			 1. 행동(목적)
			 	a. 산술 연산자 
			 	- +, -, *, /, %(mod, 나머지)
			 	- 2항 연산자
			 	- 피연산자를 숫자형을 가진다. (정수, 실수)
			 	
			 	b. 비교 연산자
			 	c. 논리 연산자
			 	d. 대입 연산자
			 	e. 증강 연산자
			 	f. 조건 연산자
			 	g. 비트 연산자
			 
			 2. 용법(피연산자 개수)
 				a. 1항 연산자
 				b. 2항 연산자
 				c. 3항 연산자
 				
 				
 		
			 */
			
			int a = 10;
			int b = 3;
			
			System.out.printf("%d + %d = %d\n", a, b, a + b);
			System.out.printf("%d - %d = %d\n", a, b, a - b);
			System.out.printf("%d * %d = %d\n", a, b, a * b);
			System.out.printf("%d / %d = %d\n", a, b, a / b);
			System.out.printf("%d %% %d = %d\n", a, b, a % b);
			System.out.println();
			
			
		double c = 10;
		double d = 3;
		
		System.out.printf("%f / %f = %f\n", c, d, c / d);
		System.out.println();
		
		System.out.println(10 / 3); //int/int = int
		System.out.println(10.0 / 3.0);//double/double = double
		System.out.println(10.0 / 3);//double/int = double
		System.out.println(10 / 3.0);//int/double = double
		System.out.println();
		
		//System.out.println(100 / 0);
		System.out.println(100 / 0.0);
		
		
		//*** 모든 산술 연산자의 결과 자료형은
		//	  두 피연산자의 자료형 중 더 크기가 큰 자료형으로 변환한다.
		
		int e = 1000000000;
		int f = 2000000000;
		
		System.out.println(e + f);
		System.out.println((long)e + f);
		
		e = 300000;
		f = 500000;
		
		System.out.println(e * (long)f);
		
		e = -2100000000;
		f = 100000000;
		
		System.out.println(e - f);
		
		byte b1 = 10;
		byte b2 = 20;
		byte b3;
		
		
		//byte + byte = byte(x) int(o) (예외상황)
		//short + short = int
		//Type mismatch: cannot convert from int to byte
		//byte, short 연산 결과는 무조건 int다 > CPU 처리 단위
		//명시적 형변환
		b3 =(byte)(b1 + b2);
		
		// 위와 같은 이유 > 정수 사용 > byte, short 거의 사용 안 함
		// 정수 > 주로 int 사용
		System.out.println();
		System.out.println(10 % 3);
		System.out.println(10 % 4);
		System.out.println(10 % 5);
		System.out.println(10 % 10);
		System.out.println(10 % 11);
		
		//나머지 연산자
		// - 패턴
		
		
		
		
		
		}
	

}
