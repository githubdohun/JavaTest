package com.test.question;

import java.util.Scanner;

public class Q002 {
	public static void main(String[] args) {
		
		//숫자 2개를 입력받아 아래의 연산식을 출력하시오.
		
		Scanner scan = new Scanner(System.in);
		
		
		
		System.out.println("첫번째 숫자: ");
		int num1;
		 num1 = scan.nextInt();
		 
		System.out.println("두번째 숫자: ");
			int num2;
			 num2 = scan.nextInt();
			 
	 System.out.printf("%4d + %4d = %d\n", num1, num2, num1  + num2);
	 System.out.printf("%4d - %4d = %d\n", num1, num2, num1  - num2);
	 System.out.printf("%4d * %4d = %d\n", num1, num2, num1  * num2);
	 System.out.printf("%4d / %4d = %d\n", num1, num2, num1  / num2);
	 System.out.printf("%4d %% %4d = %d\n", num1, num2, num1  % num2);

		 
		
	}

}
