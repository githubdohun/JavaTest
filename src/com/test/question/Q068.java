package com.test.question;

import java.util.Arrays;
import java.util.Scanner;

public class Q068 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		int[] nums = new int[] {5, 6, 1, 3, 2, 0, 0, 0, 0, 0};
		
		System.out.print("삽입 위치: ");
		int delete = scan.nextInt();
		
		
		
		System.out.println(Arrays.toString(nums));
		
		for (int i=delete; i<nums.length - 2; i++) {
			
			//왼쪽 = 오른쪽 방
			nums[i] = nums[i+1];
			
		}
		
		nums[nums.length - 1] = 0;
		
		System.out.println(Arrays.toString(nums));
		
	}

}
