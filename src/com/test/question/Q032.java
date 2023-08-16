package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q032 {
	public static void main(String[] args) {
		
		int inHour = 0;
		int inMinute = 0;
		int outHour = 0;
		int outMinute = 0;
		long gap = 0;
		long fee = 0;
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("[들어온 시간]");
		
		System.out.print("시: ");
		inHour = scan.nextInt();
		
		System.out.print("분: ");
		inMinute = scan.nextInt();
		
		
		System.out.println("[나간 시간]");
		
		System.out.print("시: ");
		outHour = scan.nextInt();
		
		System.out.print("분: ");
		outMinute = scan.nextInt();
		
		Calendar in = Calendar.getInstance(); //현재 시간
		
		in.set(Calendar.HOUR_OF_DAY, inHour); // 들어온 시를 보여준다
		in.set(Calendar.MINUTE, inMinute); // 들어온 분을 보여준다
		
		Calendar out = Calendar.getInstance();
		
		out.set(Calendar.HOUR_OF_DAY, outHour); // 나간 시를 보여준다
		out.set(Calendar.MINUTE, outMinute); // 나간 분을 보여준다
		
		gap = out.getTimeInMillis() - in.getTimeInMillis();
		fee = (((gap / 1000 / 60) - 30) / 10) * 2000;
		
		System.out.printf("주차 요금은 %d원입니다.\n", fee);
		
		
		
		
		
		
	}

}
