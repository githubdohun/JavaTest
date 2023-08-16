package com.test.question;

import java.util.Scanner;

public class Q001 {
	public static void main(String[] args) {
		
		//태어난 년도를 입력받아 나이를 출력하시오.
		
		Scanner scan = new Scanner(System.in);
		
		
	 System.out.print("태어난 년도: ");
	 
	 int year = 0;
	  year = scan.nextInt();
	 
	 
	 int age = 0;
	 
	 age = 2023 - year - 1;
	 
	 System.out.print("나이: " + age +"세");
	}

}
