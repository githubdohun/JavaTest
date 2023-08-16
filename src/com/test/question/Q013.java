package com.test.question;

import java.util.Scanner;

public class Q013 {
	
	//국어, 영어, 수학 점수를 전달하면 '합격' 혹은 '불합격'이라는 단어를 반환하는 메소드를 선언하시오.
	
	public static void main(String[] args) {
		String result = "";
		int kor;
		int eng;
		int math;
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("국어 점수: ");
		kor = scan.nextInt();
		
		System.out.print("영어 점수: ");
		eng = scan.nextInt();
		
		System.out.print("수학 점수: ");
		math = scan.nextInt();
		
		
		result = test(kor, eng, math);
		System.out.printf("%s입니다.", result);
	}

	private static String test(int kor, int eng, int math) {
		
		String result = "";
		
		result = ((kor + eng + math) / 3 >= 60 ) ? "합격" : "불합격";
		
		result = (kor < 40 || eng < 40 || math < 40) ? "불합격" : result;
		
		return result;
		
		
		
	}

}
