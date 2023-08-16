package com.test.question;

import java.util.Calendar;

public class Q019 {
	
	public static void main(String[] args) {
		
		//현재 시간을 출력하는 메소드 선언하시오.
		
		d1();
	}

	private static void d1() {
		
		Calendar now = Calendar.getInstance();
		System.out.printf("현재 시간: %d시 %d분 %d초\n" 
						, now.get(Calendar.HOUR_OF_DAY)
						, now.get(Calendar.MINUTE)
						, now.get(Calendar.SECOND)); //현재 시간: 10시 23분 31초
		
		
		System.out.printf("현재 시간: %s %d시 %d분 %d초\n"
						, now.get(Calendar.AM_PM) == 0 ? "오전" : "오후"
						, now.get(Calendar.HOUR_OF_DAY)
						, now.get(Calendar.MINUTE)
						, now.get(Calendar.SECOND)); //현재 시간: 오전 10시 23분 31초

		
		
	}
	


}
