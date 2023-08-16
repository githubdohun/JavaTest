package com.test.question;

public class Q058 {
	
	public static void main(String[] args) {
		
		int sum = 0;
		
		for (int i=10; i<=100; i+=10) {
				
			sum = 0;
			
			for (int j=i-9; j <= i; j++) {
				
				sum += j;
				
				
			}

			
			System.out.printf("%2d ~ %3d: %4d\n",(i-1*10)+1, i, sum);
		}
		
		
	}

}
