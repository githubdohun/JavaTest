package com.test.java;

public class Ex13_Casting {

		public static void main(String[] args) {
			
			/*
			 
			 형변환, (자료)형 변환
			 - Casting, Data Type Casting
			 - 하나의 자료형을 또 다른 자료형으로 변환하는 작업
			 - 코드 작성을 유연하게 하기 위해서 사용
			 - int -> double
			 - float -> short
			 
			 1. 암시적 형변환(자동 타입 변환)
			 	- 큰형 = 작은형
			 	- 100% 안전한 작업
			 	- 복사를 했을 때 원본과 항상 동일한 값 복사
			 2. 명시적 형변환(강제 타입 변환)
			 - 작은형 = 큰형
			 - 경우에 따라 다르다
			 - 늘 신경써서 관리
			 
			 명시적 형변환 시 발생하는 데이터가 넘치는 현상 . 오버플로우
			 1. 위로 넘치는 현상 > overflow
			 2. 아래로 넘치는 현상 > underflow
			 
			 ***오버플로우가 발생할 만한 상황을 미리 예측해서 관리가 필요하다.
			 
			 
			 
			 
			 
	
			 */
			
			byte a;
			short b;
			
			a = Byte.MAX_VALUE;
			
			//암시적 형변환
			//short(2) = byte(1)
			//(자료형) : 형변환 연산자
			
			//b = a;
			b = (short)a;
			
			System.out.println(b);
			
			
			byte c = 10;
			long d;
			
			d = c; //d = (long)c;
			
			System.out.println(d);
			
			short e;
			byte f;
			
			e = 1000;
			
			f = (byte)e;
			
			System.out.println(f);//-24
			
			int g; //복사본
			long h; //원본
			
			h = 3000000000L;
			
			//복사(계좌이체)
			
			g = (int)h;
			
			System.out.println("이체 결과: " + g);
		}
}
