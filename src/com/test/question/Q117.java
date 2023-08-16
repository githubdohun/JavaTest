package com.test.question;

import java.io.File;

public class Q117 {
	
	public static void main(String[] args) {
		
		//내용 있는 폴더 삭제하기
		File dir = new File("C:\\Users\\sjw05\\OneDrive\\바탕 화면\\파일_디렉토리_문제(파일 이름 수정하기)\\폴더 삭제\\delete");
		
		//탐색
		delete(dir);
	}//main

	private static void delete(File dir) {
		
		File[] list = dir.listFiles();
		
		for (File f : list) {
			if(f.isFile()) {
				//action
				f.delete();
				//count++;
				System.out.println("종료");
			}
		}
		for (File d : list) {
			if(d.isDirectory()) {
				delete(d);
			}
		}
		
		//***
		dir.delete();
		//count++;
	}

}
	