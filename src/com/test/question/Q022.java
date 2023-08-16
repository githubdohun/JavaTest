package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q022 {
	public static void main(String[] args) {
		
		String mName = ""; 
		String wName = "";
		int year = 0;
		int month = 0;
		int day = 0;
		
		Calendar loveStart = Calendar.getInstance();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("남자 이름:");
		mName = scan.nextLine();
		
		System.out.println("여자 이름");
		wName = scan.nextLine();
		
		System.out.println("만난 날(년): ");
		year = scan.nextInt();
		
		System.out.println("만난 날(월): ");
		month = scan.nextInt();
		
		System.out.println("만난 날(일): ");
		day = scan.nextInt();
		
		loveStart.set(year, month - 1, day);
		
		System.out.printf("%s 와 %s의 기념일\n", mName, wName);
		
		loveStart.add(Calendar.DATE, 100);
		System.out.printf("100일: %tF\n", loveStart);
		
		loveStart.add(Calendar.DATE, 100);
		System.out.printf("200일: %tF\n", loveStart);
		
		loveStart.add(Calendar.DATE, 100);
		System.out.printf("300일: %tF\n", loveStart);
		
		loveStart.add(Calendar.DATE, 200);
		System.out.printf("500일: %tF\n", loveStart);
		
		loveStart.add(Calendar.DATE, 500);
		System.out.printf("1000일: %tF\n", loveStart);
		
		
		
		
		
		
	}

}
