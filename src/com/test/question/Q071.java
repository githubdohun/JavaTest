package com.test.question;

public class Q071 {
	
	public static void main(String[] args) {
		
		int[][] nums = new int[5][5];
	      
	      //데이터 입력 > 문제
	      int n = 25;

	      for (int i=0; i<5; i++) {
	         for (int j=0; j<5; j++) {
	            nums[i][j] = n;
	            n--;
	         }
	      }
	      
	      //출력!! > 수정없이 그대로 사용
	      for (int i=0; i<5; i++) {
	         for (int j=0; j<5; j++) {
	            System.out.printf("%5d", nums[i][j]);
	         }
	         
	         System.out.println();
	         
	      }
	}//main



}
