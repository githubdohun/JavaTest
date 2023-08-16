package com.test.question;

import java.io.File;
import java.util.Scanner;

public class Q110 {
	
	public static void main(String[] args) {
		
		String path = ""; //초기화
		
		Scanner scan = new Scanner(System.in); //입력 받기
		System.out.println("파일 경로: "); 
		path = scan.nextLine();
		
		File file = new File(path); //파일 메소드 생성
		
		if (file.exists()) {
		System.out.printf("파일명: %s\n", file.getName()); //getName() 파일의 이름
		System.out.printf("종류: %s\n", file.getName().substring(file.getName().lastIndexOf(".") + 1) + "파일");
		// getName() 메소드로 파일의 이름을 받아서
		//문자열을 자르는 substring 메소드로 getName()으로 받은 파일의 이름에서
		//lastIndexOf()를 사용하여 오른쪽에서 왼쪽 방향으로 "." 을 찾아 1을 더해 "." 다음 문자열을 출력한다. ex) data.txt -> txt
		
		System.out.printf("파일 크기: %s\n", file.length()); //length() 파일 크기 메소드
		}
		
	}//main

}
