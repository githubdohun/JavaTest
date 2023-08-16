package com.test.question;

import java.util.Scanner;



public class Q039 {
	public static void main(String[] args) {
		
		int startNumber = 0;
		int endNumber = 0;
		int sum = 0;
		
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("시작 숫자: ");
		startNumber = scan.nextInt();
		
		System.out.print("종료 숫자: ");
		endNumber = scan.nextInt();
		
		for (int i=startNumber; i<=endNumber; i++) {
			sum = sum + i;
			
		
				if (i != endNumber) {
					System.out.printf("%d + ", i);
				} else {
				System.out.print(i);
			}
			
			System.out.println(" = " + sum);
		
				}	
		
		
		}//main
		
	}


