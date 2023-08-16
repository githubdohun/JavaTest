package com.test.question;

import java.util.Scanner;

public class Q045 {
	
	public static void main(String[] args) {
		
		
		int num = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("최대 숫자: ");
		num = scan.nextInt();
		
		for (int i=1; i<=num; i++) {
			
			int count = 0;
			
			if (i / 10 == 3 || i / 10 == 6 || i / 10 == 9) { //10의 자리
				count ++;
				}
			if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9) { //1의 자리
				count ++;
			}
			if (count == 2) {
				
				System.out.print(" 짝짝 ");
				
			} else if (count == 1) {
			
				System.out.print("짝 ");
				
			} else {
				
				System.out.print(i + " ");
			}
				
			
				
			}
		
		}//main
		
		
	}


