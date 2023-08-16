package com.test.question;

import java.io.File;

public class Q119 {
	//아래의 조건에 따라 파일을 폴더별로 분류/이동하시오.
	public static void main(String[] args) {
		
		File dir = new File("C:\\Users\\sjw05\\OneDrive\\바탕 화면\\파일_디렉토리_문제(파일 이름 수정하기)\\직원");
		
		File[] list = dir.listFiles();
		
		for (File f : list) {
			//아무게_2014__17.txt
			
			String[] temp = f.getName().split("_");
			
			String name = temp[0];
			String year = temp[1];
			
			
			File nameDir = new File (dir.getAbsolutePath() + "\\" + name); // getAbsolutePath() 전체 경로
			nameDir.mkdir();
			
			
			File yearDir = new File (dir.getAbsolutePath() + "\\" + name + "\\" + year); // getAbsolutePath() 전체 경로
			yearDir.mkdir();
			
			File dest = new File(dir.getAbsolutePath() + "\\" + name + "\\" + year + "\\" + f.getName());
			f.renameTo(dest);
		
		}	
	}//main

}
