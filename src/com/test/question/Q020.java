package com.test.question;

import java.util.Calendar;

public class Q020 {
	
	public static void main(String[] args) {
		
		//오늘 태어난 아이의 백일과 첫돌을 출력하시오.
		
		
		m1();
		
	}//main

	private static void m1() {
	
		Calendar now = Calendar.getInstance();
		
		now.add(Calendar.DATE, 100);
		System.out.printf("백일: %tF\n", now);
		
		
		now = Calendar.getInstance();
		
		now.add(Calendar.YEAR, 1);
		System.out.printf("첫돌: %tF\n", now);
		
	}

}
