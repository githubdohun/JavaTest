package com.test.question;

import java.util.Scanner;

public class Q080 {
	
	public static void main(String[] args) {
		
		String msg = "";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("문장 입력 : ");
		msg = scan.nextLine();
		
		
		
		
		StringBuffer sb = new StringBuffer(msg);
        String reversedStr = sb.reverse().toString();
        System.out.println("역순 결과: " + reversedStr);
	}

}
