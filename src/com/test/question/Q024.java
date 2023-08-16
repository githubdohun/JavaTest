package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q024 {
	public static void main(String[] args) {
		
		//여러 배달 음식을 같은 시간에 받기를 원하는 고객이 있다. 
		//고객이 각각의 매장에 몇시에 전화를 해야 모든 음식을 같은 시간에 받을 수 있는지 알려주시오.
	int wantHourTime = 0;
	int wantMinuteTime = 0;
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("음식을 받기 원하는 시각");
	
	System.out.print("시: ");
	wantHourTime = scan.nextInt();
	
	System.out.print("분: ");
	wantMinuteTime = scan.nextInt();
	
	Calendar startDelivery = Calendar.getInstance();
	
	startDelivery.set(Calendar.HOUR_OF_DAY, wantHourTime);
	startDelivery.set(Calendar.MINUTE, wantMinuteTime);
	
	
	startDelivery.add(Calendar.MINUTE, -10);
	System.out.printf("짜장면: %d시 %d분\n", startDelivery.get(Calendar.HOUR_OF_DAY), startDelivery.get(Calendar.MINUTE));
	
	startDelivery.add(Calendar.MINUTE, -8);
	System.out.printf("치킨: %d시 %d분\n", startDelivery.get(Calendar.HOUR_OF_DAY), startDelivery.get(Calendar.MINUTE));
	
	startDelivery.add(Calendar.MINUTE, -7);
	System.out.printf("피자: %d시 %d분\n", startDelivery.get(Calendar.HOUR_OF_DAY), startDelivery.get(Calendar.MINUTE));
	
	
	
	}

}
