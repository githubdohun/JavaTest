package com.test.question;

public class Q060 {
	
	public static void main(String[] args) {
		
		int sum = 1;
		int a = 0;
		int b = 1;
		int temp = 0;
		String txt = "1 +";
		
		while (true) {
			
			temp = a + b;
			
			if (temp > 100) {
				break;
			}
			
			sum += temp;
			txt += temp + " + ";
			
			a = b;
			b = temp;
			
			
		}
		
		System.out.printf("%s = %d\n", txt, sum);
		
	}
	
}

