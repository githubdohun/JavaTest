package com.test.question;

import java.util.Scanner;

public class Q061 {
	public static void main(String[] args) {
		
		int num = 0;
		
		int[] nums = new int[5];
		
		Scanner scan = new Scanner(System.in);
		
		for (int i=0; i<nums.length; i++) {
			
			System.out.print("숫자: "	);
			num = scan.nextInt();
			
			nums[i] = num;
		}
		
		for (int i=nums.length-1; i>=0; i--) {
			System.out.printf("nums[%d] = %d\n", i, nums[i]);
		}
		
	}//main

}
