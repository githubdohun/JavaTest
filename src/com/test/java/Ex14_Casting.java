package com.test.java;

public class Ex14_Casting {
		public static void main(String[] args) {
			
			//정수형 리터럴은 int이다
			//실수형 리터럴은 double이다.
			
			//byte = int
			//작은형(1) = 큰형(4)
			byte b1 = 10; //서비스 문법
			
			//short = int
			//작은형(2) = 큰형(4)
			short s1 = 10;
			
			//int = int
			int n1 = 10;
			
			//long = int
			//큰형 = 작은형
			long l1 = 10;
			
			float f1 = 3.14f;
			double f2 = 3.14D;
			
			
			//==============================================================
			
			//정수 > 실수
			
			int n2 = 100; //원본
			float n3; //복사본
			
			//형변환
			//float = int
			//암시적 형변환 > 안전
			n3 = n2;
			
			System.out.println(n3);
			
			
			//실수 > 정수
			//명시적 형변환
			int n4; //복사본
			float n5 = 100; //원본
			
			n4 = (int)n5;
			
			System.out.println(n4);
			
			
			//** 정수와 실수간의 크기 비교는 단순하게 byte로 하는 게 아니라 실제 표현 가능한 숫자의 범위로 비교해야한다.
			// int(4) < float(4)
			// long(8) < float (4)
			//크기 정리
			//b<s<i<l<<<f<d
			
			char m1; //2byte
			short m2;
			
			m1 = 'A';
			
			//형변환
			//short = char
			//2byte = 2byte
			m2 = (short)m1;
			
			System.out.println(m2);
			
			char m3;
			short m4;
			
			m4 = 65;
			
			m3 = (char)m4;
			
			System.out.println(m3);
			
			int m5;
			char m6;
			
			m5 = 44032;
			
			System.out.println((char)m5);
			
			m6 = '가';
			System.out.println((int)m6);
			
			//*** 값형끼리 형변환
			//*** 값형과 참조형끼리는 형변환이 절대 불가능
			//*** boolean 형변환 불가능
			//정수 > 정수
			//실수 > 실수
			//정수 > 실수
			//실수 > 정수
			//문자 > 정수
			//정수 > 문자
			
			//값형 <- 형변환(o) -> 값형
			//값형 <- 형변환(x) -> 참조형
			
			String a1 = "100";
			int a2;
			
			//"100" > 100
			a2 = Integer.parseInt(a1);//형변환(x)
			
			System.out.println(a2);
			
			//100 > "100"
			String a3;
			int a4;
			
			a4 = 100;
			//   String.valueOf(값형);
			a3 = String.valueOf(a4); //100 > "100"
			
			a3 = a4 + ""; //100 + "" > "100" + "" > "100"
						
					
		}
}