package com.test.question;

import java.util.Scanner;

public class Q025 {
	
	//숫자 2개를 입력받아 큰수와 작은수를 출력하시오.
	
	public static void main(String[] args) {
		
		int max = 0;
		int min = 0 ;
		int n1 = 0;
		int n2 = 0;
		int gap;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 숫자: ");
		n1 = scan.nextInt();
		
		System.out.print("두번째 숫자: ");
		n2 = scan.nextInt();
		
		if (n1 > n2) {
			max = n1;
			min = n2;
		} else {
			max = n2;
			min = n1;
		}
		
		gap = max - min;
		
		System.out.printf("큰수는 %d이고, 작은수는 %d입니다. 두 숫자는 %d(가)이 차이납니다.\n",n1, n2, gap);
		
	}

}
