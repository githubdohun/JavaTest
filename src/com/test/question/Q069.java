package com.test.question;

import java.util.Arrays;
import java.util.Scanner;

public class Q069 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("배열 길이: ");
		int input = scan.nextInt();
		int[] nums = new int[input]; //0123456
		int[] sums = new int[input/2]; //01234
		for(int i=0; i<input; i++) {
			 nums[i]= (int)(Math.random() * 9) + 1;
		}
		System.out.printf("원본: %s\n",Arrays.toString(nums));
		for(int i=0; i<input; i+=2) { //02468 01234
			sums[i/2] = nums[i]+nums[i+1];
		}
		System.out.printf("결과: %s\n",Arrays.toString(sums));
	}
}

