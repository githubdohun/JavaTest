package com.test.question;

import java.util.Scanner;

public class Q014 {
	
	//지하철 탑승 소요 시간을 구하시오. 지나가는 역의 개수, 환승역의 횟수, 시간대를 전달 받아 총 걸리는 시간을 반환하는 메소드를 선언하시오.

	public static void main(String[] args) {
		
		
		int result = 0;
		int station = 0;
		int transfer = 0;
		int time = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("역의 개수: ");
		station = scan.nextInt();
		
		System.out.print("환승역의 횟수: ");
		transfer = scan.nextInt();
		
		System.out.println("시간대 (1.평상시, 2.출근시, 3.퇴근시: ");
		time = scan.nextInt();
		
		result = getTime(station, transfer, time);
		System.out.printf("총 소요 시간은 %d분입니다.\n", result);
		
		
		
	}

	private static int getTime(int station, int change, int time) {
		
		int result = 0;
		
		result = station * 2 + change * (time == 1 ? 3 : time == 2 ? 4 : 5);
		
		return result;
		
		
	}
}
