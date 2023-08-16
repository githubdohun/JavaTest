package com.test.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Ex11_BufferedReader {
		public static void main(String[] args) throws Exception{
			
			//BufferedReader 클래스
			
			//ctrl +shift +o
			
			//reader> 콘솔 입력 도구
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
//			System.out.println("문자 입력: ");
//			
//			//int code = reader.read();
//			
//			//System.out.printf("%c\n", code);
//			
//			String line = reader.readLine();
//			System.out.println(line);
			
			
//			System.out.print("이름 입력: ");
//			
//			//readline(): 입력 버퍼에서 처음부터 ~ 엔터(\r\n)를 만나기 전까지 모두 읽어오는 메소드
//			//- 엔터는 자동으로 삭제
//			String name = reader.readLine();
//			System.out.printf("안녕하세요.%s님\n", name);
//			
			
			
			
//			System.out.print("숫자 입력");
//			
//			String num = reader.readLine(); //100 > "100"
//			
//			//int num2 = Integer.parseInt(num); //"100" > 100
//			
//			double num2 = Double.parseDouble(num);
//			
//			System.out.println(num2 * 2);
			
			//요구사항] 숫자 2개 입력 > + 연산 > 연산과정과 결과를 모두 출력

			//숫자1: 5
			//숫자2: 3
			//5 + 3 = 8
			
//			System.out.print("첫번째 숫자: ");
//			String input1 = reader.readLine();
//			
//			System.out.print("두번째 숫자: ");
//			String input2 = reader.readLine();
//			
//			int n1 = Integer.parseInt(input1);
//			int n2 = Integer.parseInt(input2);
//			
//			System.out.printf("%d + %d = %d\n", n1, n2, n1 + n2);
			
			System.out.print("숫자: ");
			String input = reader.readLine();
			
			int num = Integer.parseInt(input);
			
			System.out.println(100 / num);
			
			//에러,error
			//오류, 버그, 예외 등
			//1. 컴파일 에러
			//- 컴파일 작업 중에 발생하는 에러 - 컴파일러가 발견 - 번역하다가 - 문법이 틀려서 - 컴파일 작업 중단 - 프로그램 생성 불가 - 반드시 해결
			
			//2. 런타임 에러 - 프로그램 실행 중.. - 동작 중에 나는 에러 - 컴파일 작업 중에는 에러가 없음 - 문법에는 유류가 없는데.. 다른 원인으로 발생하는 에러
			// - 예외 - 난이도 중간 > 발견o, 발견x > 복불복
			// - 충분히 사전 테스트 필요
			
			
			//3. 논리 에러
			// - 컴파일 성공 + 실행 성공 > 결과가 이상함
			// 난이도 최상 > 발견 최악 + 수정 최악
		}

}
