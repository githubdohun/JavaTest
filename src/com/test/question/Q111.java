package com.test.question;

import java.io.File;
import java.util.Scanner;

public class Q111 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("폴더: ");		//폴더 입력받기
		String folder = scan.nextLine();
		
		System.out.println("확장자: ");	//확장자 입력받기
		String extend = scan.nextLine();
		
		File directory = new File(folder); //파일 메소드 사용하기 위함
		
		File[] list = directory.listFiles(); 
		
		for (File file : list) {
			if (file.getName().toLowerCase().endsWith(extend.toLowerCase())) {
				//file.getName() 파일 이름
				//file.getName().toLowerCase() 파일 이름을 소문자로 변환
				//.endsWith(extend.toLowerCase())  소문자로 변환된 파일 이름이 특정 확정자로 끝나는가
				//extend.toLowerCase()) 검사하려는 확장자를 소문자로 변환
				System.out.println(file.getName());
			}
		}
		
	}//main

}
