package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q021 {
	public static void main(String[] args) {
		
		int age = 0;
		int year = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("태어난 년도: " );
		year = scan.nextInt();
		
		
		Calendar now = Calendar.getInstance();
		
		age = now.get(Calendar.YEAR) - year + 1;
		System.out.printf("나이: %d세\n", age);
		
	}

}
