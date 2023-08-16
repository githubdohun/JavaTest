package com.test.question;

import java.util.Scanner;

public class Q040 {
	public static void main(String[] args) {
		
		int startNum = 0;
		int endNum = 0;
		int sum = 0;
		String txt = "";
		String op = " - ";
		
		Scanner scan = new Scanner(System.in);
		System.out.println("시작 숫자: ");
		startNum = scan.nextInt();
		
		System.out.println("종료 숫자: ");
		endNum = scan.nextInt();
		
		for (int i=startNum; i<=endNum; i++) {
			
			if (op.equals(" - ")) {
				sum = sum + i;
				txt = txt + i;
				op = " + ";
				if (i < endNum) {
					txt += op;
				}
			} else {
				sum -= i;
				txt += i;
				op = " - ";
				if (i < endNum) {
					txt += op;
				}
			}
		}
				
		System.out.println(txt + " = " + sum);
		
			
			
		}//main	
		
}	

