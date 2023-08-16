package com.test.question;

public class Q073 {
	
	public static void main(String[] args) {
		
		int[][] nums = new int [5][5];
		
		int n = 1;
		
		for (int i=0; i<=nums.length - 1; i++) {
			for (int j=0; j<=nums.length - 1; j++) {
				
				nums[j][i] = n;
	            n++;
			}
			
			
		}
		

		
	}//main

}


