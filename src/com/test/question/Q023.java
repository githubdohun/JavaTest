package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q023 {
	public static void main(String[] args) {
		
		int dadYear;
		int dadMonth;
		int dadDay;
		int dauYear;
		int dauMonth;
		int dauDay;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("아빠 생일(년): ");
		dadYear = scan.nextInt();
		
		System.out.println("아빠 생일(월): ");
		dadMonth = scan.nextInt();
		
		System.out.println("아빠 생일(일): ");
		dadDay = scan.nextInt();
		
		System.out.println("딸 생일(년): ");
		dauYear = scan.nextInt();
		
		System.out.println("딸 생일(월): ");
		dauMonth = scan.nextInt();
		
		System.out.println("딸 생일(월): ");
		dauDay = scan.nextInt();
		
		Calendar dadBirthday = Calendar.getInstance();
		
		dadBirthday.set(dadYear, dadMonth - 1, dadDay);
		
		Calendar dauBirthday = Calendar.getInstance();
		
		dauBirthday.set(dauYear, dauMonth - 1, dauDay);
		
		long dadBirthdayTick = dadBirthday.getTimeInMillis();
		
		
		long dauBirthdayTick = dauBirthday.getTimeInMillis();
		
		
		long gap = dauBirthdayTick - dadBirthdayTick;
		System.out.printf("아빠는 딸보다 총 %,d일을 더 살았습니다.\n", gap / 1000 / 60/ 60 / 24);
	}

}
