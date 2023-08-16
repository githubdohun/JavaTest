package com.test.question;

public class Q042 {
	
	public static void main(String[] args) {
		
		int year = 2023;
		int month = 7;
		int date = 25;
		String day = "";//요일
		
		int sum = 0; //누적 변수 (총 몇 일)
		
		//1. 1년 1월 1일 ~ 2022년 12월 31일
		
		//2. 2023년 1월 1일 ~ 2023년 6월 30일
		for (int i=1; i<year; i++) {
			
			sum = sum + 365;
			
			if (isLeafYear(i));
			
		}
		
		for (int i=1; i<month; i++) {
			
			sum = sum + getMaxDate(year,month);
			
		}
		
		sum += date;
		
		
		System.out.printf("2023년 7월 25일은 %,3d일째 되는 날이고 %s요일입니다.\n", sum, day);

		
	}

	private static int getMaxDate(int year, int month) {
		
		switch (month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				return 31;
			case 4: case 6: case 9: case 11:
				return 30;
			case 2:
				return isLeafYear(year) ? 29 : 28;
				
		}
		
		return 0;
	}

	private static boolean isLeafYear(int year) {
		
		if (year % 4 == 0) {
			
			if(year % 100 != 0) {
				
				if (year % 400 == 0) {
					
					return true;
					
				}else {
					
					return false;
					
				}
				
			} else {
				
				return true;
				
			}
		} else {
			
			return false;

			}
	}
}
