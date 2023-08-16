package com.test.question;

import java.io.File;
import java.util.Scanner;

public class Q112 {
	
	public static void main(String[] args) {
		
		String path1 = "C:\\class\\code\\java\\AAA\\test.txt";
		String path2 = "C:\\class\\code\\java\\BBB\\test.txt";
		
		File file1 = new File(path1);
		File file2 = new File(path2);
		
		System.out.println("파일 이동 실행");
		
		
		if (!file2.exists()) {	//같은 이름의 파일이 없으면?
			file1.renameTo(file2);
			System.out.println("파일 이동 완료");
			
		} else {
			System.out.println("같은 이름을 가지는 파일이 이미 존재합니다. 덮어쓸까요?(y/n)");
			
			Scanner scan = new Scanner(System.in);
			
			if (scan.nextLine().equals("y")) { //만약 입력 받은 문자가 y면?
				
				file2.delete();
				file1.renameTo(file2); //덮어쓰기 기존에 있던 file2를 지우고 덮어쓰기
				System.out.println("파일을 덮어썼습니다.");
				
			} else {
				System.out.println("작업을 취소합니다.");
			}
		}
		
		
	}//main

}
