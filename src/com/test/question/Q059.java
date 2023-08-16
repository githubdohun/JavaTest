package com.test.question;

public class Q059 {
	
	public static void main(String[] args) {
		
		int sum = 1;
		int num = 1;
		int add = 1;
		String txt = "1 + ";
		
		while (true) { //무한루프
			
			num += add;
			
			if (num > 100) {
				break;
			}
			
			txt += num + " + ";
			sum += num;
			add++;
		}
		
		System.out.printf("%s = %d\n", txt, sum);
		
		}
}

