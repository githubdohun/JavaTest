package com.test.question;

public class Q075 {
	
	public static void main(String[] args) {
		
		int[][] list = new int[5][5]; //2차원 배열 생성
		int n = 1;
		
		for(int i=0; i<list.length - 1; i++) { //행을 순회합니다. (0부터 3까지)
			for (int j=0; j<list.length-1; j++) { //열을 순회합니다. (0부터 3까지)
				
				list[i][j] = n; // 배열의 현재 위치에 변수 n의 값을 할당합니다.
				list[i][4] += n; //현재 행의 마지막 열(4열)에도 값을 더합니다.
				list[4][i] += n; //현재 열의 마지막 행(4행)에도 값을 더합니다.
				list[4][4] += n; //배열의 오른쪽 아래 대각선 위치에도 값을 더합니다.
				
				n++;
			}
		}
		
		printArray(list);
		
	}//main

	private static void printArray(int[][] list) {
		for(int i=0; i<list.length; i++) { 
			for (int j=0; j<list[0].length; j++) { 
				System.out.printf("%3d\t", list[i][j]);
			}
			System.out.println();
		}
		
	}

}
