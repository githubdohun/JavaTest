package com.test.question;

public class Q041 {
	
	public static void main(String[] args) {
		int sum = 0;
		String txt = ""; 
		
		
		for(int i=1; ; i++) {
			sum = sum + i;
			txt = txt + i;
			
				if (i < 45) {
					txt += " + ";
				} 
					if (sum > 1000) {
						break;
						
					}
	
			
		}
		System.out.println(txt + " = " + sum);
		
	}

}
