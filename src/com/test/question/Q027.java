package com.test.question;

import java.util.Scanner;

public class Q027 {
	
	public static void main(String[] args) {
		//문자 1개를 입력받아 아래와 같이 출력하시오
		
		
		String txt = "";
		String result = "";
	    
		Scanner scan = new Scanner(System.in);
	    
	    System.out.println("문자: ");
	    txt = scan.nextLine();
	    
	    if (txt.equals("f") || txt.equals("F")) {
	    	result = "Father";
	    } else if (txt.equals("m") || txt.equals("M")) {
	    	result = "Mother";
	    } else if (txt.equals("s") || txt.equals("S")) {
	    	result = "Sister";
	    } else if (txt.equals("b") || txt.equals("B")) {
	    	result = "Brother";
	    } else {
	    	System.out.println("입력한 문자가 올바르지 않습니다.");
	    }
	    
	    System.out.println(result);
	    
	    
	}

}
