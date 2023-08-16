package com.test.question;

import java.util.Arrays;

public class Q066 {
	
	public static void main(String[] args) {
		
		//중복되지 않는 임의의 숫자 6개를 만드시오.(로또)

		int[] lotto = new int[6];
		
		for(int j=0; j<5; j++) {
		
		for (int i=0; i<lotto.length; i++) {
			
			int n = (int)(Math.random() * 45) + 1; //랜덤 1 ~ (44 + 1)
			
			if (isDuplicate(lotto, n)) {
				
				i--;
	
				
				
			} else {
				
				lotto[i] = n;
				
			}
			
			
		}
		
		System.out.println(Arrays.toString(lotto)); //결과값
	}
	
}
	
	
	
		

	private static boolean isDuplicate(int[] lotto, int n) {
		// 
		
		for(int i=0; i<lotto.length; i++) {
			
			if (lotto[i] == n) {
				
				return true;
				
			}
			
		}

		return false;
	}

}

