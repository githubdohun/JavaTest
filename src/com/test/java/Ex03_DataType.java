package com.test.java;

public class Ex03_DataType {
	
		public static void main(String[] args) {
			
			/*
			 변수, Variable
			 -개발자가 명령어를 사용해서 메모리에 할당받은 공간
			 
			 변수 생성하기 - 공간을 할당 받는 방법
			 
			 1. 생성하기 - 자료형 변수명
			 
			 학생 1명의 국어점수를 저장 후 화면 출력
			 1. 데이터의 성질 파악 
			 	a. 형태 파악 > 정수 > byte, short, int, long
			 	b. 길이 파악 > 0 ~ 100 > byte (메모리 관리)
			 
			 
			 */
			//변수 생성, 선언 
			//변수명 : 메모리 주소 번지의 별명
			byte kor;
			
			//변수 초기화 변수 = 값 (오른쪽 값을 왼쪽으로)  = (대입, 할당 연산자)
			kor = 100;
			
			System.out.println(kor); //번지수를 찾아가 그 안에 정보 출력
		}
}
