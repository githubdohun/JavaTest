package com.test.question;

public class Q072 {
	
	public static void main(String[] args) {
		
		int[][] nums = new int [5][5];
		
		int n = 1;
		
		for (int i=0; i<=nums.length - 1; i++) {
			for (int j=0; j<=nums.length - 1; j++) {
				
				nums[j][i] = n;
	            n++;
			}
			
		}
		
		for (int i=0; i<=nums.length - 1; i++) {
			for (int j=0; j<=nums.length - 1; j++) {
				
				System.out.printf("%5d", nums[i][j]);
				
			}
			System.out.println();
		
	}//main

	}

}
