package com.test.question;

import java.util.Random;
import java.util.Scanner;

public class Q065 {
	
	public static void main(String[] args) {
		
		int[] list = new int[20];
		int min = 0;
		int max = 0;
		Random rnd = new Random();								
		Scanner scan = new Scanner(System.in);
		
		for (int i=0; i<list.length; i++) {
			list[i] = rnd.nextInt(20) + 1;	//난수를 20개 발생 후 배열에 넣는다.
		}
		
		System.out.println("최대 범위: ");
		max = scan.nextInt();
		
		System.out.println("최소 범위: ");
		min = scan.nextInt();
		
		for (int i=0; i<list.length; i++) {
			System.out.print(list[i] + ", " );
		}
		System.out.println();
		
		System.out.println("결과:  ");
		
		for (int i=0; i<list.length; i++) {
			if (list[i] >= min && list[i] <= max) {
				System.out.print(list[i] + ", ");
			}
		}
		
		
	}//main

}
