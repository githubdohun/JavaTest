package com.test.java;

import java.util.Scanner;

public class Ex17_Operator {
	public static void main(String[] args) {
		
		/*논리 연산자
		- &&(end), ||(or), !(not), ^(xor)
		- 2항 연산자 (&, ||, ^)
		- 1항 연산자 !
		- 피연산자를 대상으로 정해진 규칙에 따라 연산 결과를 변환
		- 피연산자의 자료형이 boolean이다.
		- 연산의 결과가 boolean이다.
		
		소개팅 > 남자 소개
		1. 키 180cm 이상 2. 잘 생길 것
		
		
		논리곱(X)(END)
		
		A && B = ?
		
		T && T = T 
		T && F = F
		F && T = F
		F && F = F
		
		논리합(OR)
		
		A || B = ?
		
		T || T = T
		T || F = T
		F || T = T
		F || F = F
		
		부정 (NOT) - 논리를 반대로 뒤집기
		!A = ?
		
		!T = F
		!F = T
		
		베타적 논리합
		A ^ B = ?
		
		T ^ T = F
		T ^ F = T
		F ^ T = T
		F ^ F = F
		
		
		
		
		
		
		*/
		
		int age = 20;
		
		System.out.println(age > 19 && age < 60);
	
	
		/*
		 
		 대입 연산자, 할당 연산자
		 - =
		 +=, -=, *=, /=, %= : 복합 대입 연산자
		 - LValue(변수) = RValue(상수, 변수)
		 - LValue 와 RValue의 자료형은 반드시 동일해야한다. > 형변환
		 - 대입 연산자는 모든 연산자들 중 우선순위가 가장 낮다.
		 
		 연산자 우선 순위
		 - 산술(*, / > +, -) > 비교 > 논리 > 대입
		
		 연산자 연산 방향
		 - 대입, 증감 : 오른쪽 > 왼쪽
		 - 나머지 : 왼쪽 > 오른쪽
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 */
		
		int sum = 10 + 20 * 3;
		
		System.out.println(sum);
		
		int a1 = 10;
		int a2;
		int a3;
		
		a3 = a2 = a1;
		
		//복합 대입 연산자
		
		int n = 10;
		
		//n에 1을 더해서 추가
		
		n = n + 1; //(누적)
		System.out.println(n);
		n += 1;
		System.out.println(n);
		n += 5;
		System.out.println(n);
		
		n -= 2;
		System.out.println(n);
		
		n = n * 2;
		System.out.println(n);
		
		n *= 2; 
		System.out.println(n);
		
		n = 10;
		
		n %= 3;
		System.out.println(n);
		
		
		/*
		 
		 증감 연산자
		 - ++(증가), --(감소)
		 - 1항 연산자
		 - 피연산자는 숫자형
		 - 누적 연산을 함. 기존의 값에 1을 더하거나, 1을 뺀다.
		 
		 **연산자의 위치를 바꿀 수 있다. > 연산자 우선 순위가 달라진다.
		 1. ++n : 전위배치 > 연산자 우선 순위가 가장 높다.
		 2. n++ : 후위배치 > 연산자 우선 순위가 가장 낮다.
		 ** 증감연산자를 다른 연산자와 한 문장에서 사용하지 말 것!
		 
		 */
		
		n = 10;
		
		n = n + 1;
		n += 1;
		++n;
		
		System.out.println(n);
	
		n = n - 1;
		n -= 1;
		--n;
		
		System.out.println(n);
		
		n = 10;
		
		//전치
		++n;
		System.out.println(n);
		//후치
		n++;
		System.out.println(n);
		System.out.println();
		
		n = 10;
		
		int result = 0;
		
		//result = 10 + ++n;
		
		
		result = 10 + n;
		++n;
		
		System.out.println(result);
		
		n = 10;
		result = 0;
		
		//result = 10 + n++;
		
		result = 10 + n;
		n++;
		
		System.out.println(result);//20
		System.out.println(n);//11
		
		/*
		 조건 연산자
		 - ?:
		 - A ? B : C
		 - 3항 연산자
		 - A : boolean
		 - B, C : 상수, 변수 > 데이터
		 - A 조건이 참이면 B를 반환, 거짓이면 C를 반환
		 */
		
		boolean flag = false;
		String m1 = "참";
		String m2 = "거짓";
		
		String result2= flag ? m1 : m2;
		System.out.println(flag);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("나이: ");
		
		 age = scan.nextInt();
		 
		 //19세 이상 60세 미만 > 통과 or 거절
		 result2 = (age >= 19 && age < 60) ? "통과" : "거절";
		 System.out.printf("입력한 나이 %d세는 %s 입니다.\n",age,result2);
		 
		 //3항 연산자 > if문 사용
		 
		 //비트 연산자
		 int a = 10;
		 int b = 3;
		 
		 System.out.println(a & b);
		 System.out.println(a | b);
	
	
	}
}
