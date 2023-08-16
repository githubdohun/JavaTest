package com.test.question;

import java.util.Arrays;

public class Q064 {
	//1~20 사이의 난수를 담고 있는 배열을 생성하고 최댓값과 최솟값을 출력하시오.
	
	public static void main(String[] args) {
		
		int max = 0;// 최댓값을 0으로 초기화
		int min = 21; //최솟값은 가장 높은 수 + 1으로 초기화
		
		int[] nums = new int[20];
		
		for(int i = 0; i<nums.length; i++) {
			
			nums[i] = (int)(Math.random()	* 20) + 1;
			
		}
		
		System.out.println(Arrays.toString(nums));
		
		//각각의 값을 max | min과 비교해서 차리
		for(int i = 0; i<nums.length; i++) {
			
			if (nums[i] > max) {
				max = nums[i];
			}
			
			if  (nums[i] < min) {
				min = nums[i];
			}
			
		}
		
		System.out.println("최댓값: " + max);
		System.out.println("최솟값: " + min);
		
		
		
		
		
		
		
		
		
		
	}//main

}
