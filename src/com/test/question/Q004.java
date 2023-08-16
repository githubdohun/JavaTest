package com.test.question;

import java.util.Scanner;

public class Q004 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//섭씨 온도를 입력받아서 화씨 온도로 변환하시오.
		
		double cTemperature = 0;
		double fTemperature = 0;
		
		System.out.println("섭씨(℃): ");
		
	    cTemperature = scan.nextDouble();
		
		
		fTemperature = cTemperature * 1.8 + 32;
		
		
		
		System.out.printf("섭씨 %.1f ℃는 화씨 %.1f ℉입니다.\n", cTemperature, fTemperature);
		
		
		
		
		
		
	}

}
