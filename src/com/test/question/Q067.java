package com.test.question;

import java.util.Arrays;
import java.util.Scanner;

// 배열에 요소를 삽입하시오.
public class Q067 {
	
	public static void main(String[] args) {
		
		//배열 삽입 > right shift 구현
		
		Scanner scan = new Scanner(System.in);
		
		int[] nums = new int[] {5, 6, 1, 3, 2, 0, 0, 0, 0, 0};
		
		System.out.print("삽입 위치: ");
		int index = scan.nextInt();
		
		System.out.print("값: ");
		int value = scan.nextInt();
		
		System.out.println(Arrays.toString(nums));
		
		//Right Shift
		
		for (int i=nums.length - 2; i > index; i--) {
			
			nums[i+1] = nums[i];
			System.out.println(Arrays.toString(nums));
			
		}
		
		nums[index] = value;
		
		System.out.println(Arrays.toString(nums));
		
		
		
		
	}//main

}
