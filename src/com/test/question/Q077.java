package com.test.question;

public class Q077 {

	public static void main(String[] args) {
		
		int[][] nums = new int[5][5];
		
		int n = 1;
		int a;
		int b;
		
		for (int i = 0; i <= (nums.length - 1) * 2; i++) {
			if (i < nums.length) {
				for (int j = 0; j < i + 1; j++) {
					a = j;
					b = i - a;
					nums[a][b] = n;
					
					a++;
					n++;
				}
			}
			else {
				for (int j = i - nums.length + 1; j < nums.length;j++) {
					a = j;
					b = i - a;
					nums[a][b] = n;
					
					a++;
					n++;
				}
			}
		}
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[0].length; j++) {
				System.out.printf("%5d", nums[i][j]);
			}
			System.out.println();
		}
	}
	
}
