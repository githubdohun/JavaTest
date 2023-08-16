package com.test.question;

import java.io.File;
import java.util.HashMap;

public class Q114 {
	
	public static void main(String[] args) {
		
		//이미지 파일이 있다. 확장자별로 파일이 몇개 있는지 세시오.
		
		File dir = new File("C:\\Users\\sjw05\\OneDrive\\바탕 화면\\파일_디렉토리_문제(파일 이름 수정하기)\\확장자별 카운트");
		
		File[] list = dir.listFiles();
		
		
		//키 - 확장자
		//값 - 카운트
		HashMap<String,Integer> count = new HashMap<String,Integer>();
		
		for (File f : list) {
			//System.out.println(f.getName());
			String ext = getExtsntion(f.getName());
			
			if (!count.containsKey(ext)) {	
			count.put(ext, 1);	//"gif", 1 put 덮어쓰기 새로운 확장자 등록
			} else {
				count.put(ext, count.get(ext)+1); // count += 1 기존 숫자에 가져와서 1을 더해 누적
			}
			
		}
		
		System.out.println(count);
		
	}//main

	private static String getExtsntion(String name) {

		//test.png
		//test.test.png
		//System.out.println(name);
		String[] temp = name.split("\\.");	// . 사용시 - \\.
		//System.out.println(temp.length);
		String ext = temp[temp.length - 1].toLowerCase(); //무조건 소문자
		
		//System.out.println(Arrays.toString(temp));
		//System.out.println(ext);
		
		//return ext;
		
		return name.split("\\.")[temp.length-1].toLowerCase();
	}

}
