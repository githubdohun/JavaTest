package com.test.java;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Ex75 {
	
	public static void main(String[] args) throws IOException {
		/*
		프로그램 제작 > 데이터
		1. 테스트용 데이터
		 - 진짜 데이터
		 - 직접 작성
		
		2. 더미 데이터
		 - 양만 채우는 용도
		 - 프로그램으로 작성
		 
		 
		게시판
		- "게시판입니다" x 200개 
		
		회원가입 + 목록
		- JavaTest > data > "member.txt"
		- 1,홍길동,20,010-1234-5678,서울시 강남구 역삼동 > 규칙 만들기
		- 데이터 생성
		*/
		
		Random rnd = new Random();
		
		long min = 1000000000L;
        long max = 9999999999L;
        
        int minLength = 8;
        int maxLength = 12;

        long range = max - min + 1;
        
		
		String[] companyName1 = {"바이마트", "가전의모든것" , "헬로가전", "노크온", "일렉트로렌탈", "아인전자", "W렌트샵", "Play렌탈", "간지레저", "캐터필러", "세창건설", "성심중기", "빌리고", "드로잉홈", "미래유통", "S휘트니스", "아이언GYM", "건강해GYM"};
		
		
		
		String[] address1 = { "서울시", "부산시", "대전시", "광주시", "제주시" };
		String[] address2 = { "강동구", "강남구", "강서구", "강북구", "중구" };
		String[] address3 = { "역삼동", "대치동", "압구정동", "천호동", "방배동" };
		
		
		BufferedWriter writer = new BufferedWriter(new FileWriter("data\\member.txt"));
		
		for (int i=0; i<100; i++) {
			
			//회원 번호
			int no = i + 1; 
			
			
			//사업자번호
			long businessNumber = (Math.abs(rnd.nextLong()) % range) + min;
			System.out.println(businessNumber);
			
			
			
			//비밀번호
			String password = generateRandomPassword(rnd, minLength, maxLength);
	        System.out.println(password);
			
			//회사이름
			String companyName = companyName1[rnd.nextInt(companyName1.length)];
			System.out.println(companyName);
			
			//나이 (20 ~ 60)
			//int age = rnd.nextInt(41) + 20;
			
			
			//전화번호
			String tel = "010" + "-" + (rnd.nextInt(9000) + 1000) + "-" +  (rnd.nextInt(9000) + 1000);
			System.out.println(tel);
			
			
			//계좌번호
			String accountNumber = (rnd.nextInt(900000) + 100000) + "-" + (rnd.nextInt(90) + 10) + "-" +(rnd.nextInt(900000) + 100000);
			System.out.println(accountNumber);
			
			
			//주소
			String address = address1[rnd.nextInt(address1.length)] + " " + address2[rnd.nextInt(address2.length)] + " " + address3[rnd.nextInt(address3.length)] + " " + (rnd.nextInt(100) + 20) + "번지";
			System.out.println(address);
			
			writer.write(String.format("%d,%d,%s,%s,%s,%s,%s\r\n", no, businessNumber,password, companyName,tel,accountNumber, address));
			
			
		}//for
		
		writer.close();
		
		System.out.println("더미 데이터 생성 완료");
		
	}//main

	private static String generateRandomPassword(Random rnd, int minLength, int maxLength) {
		
		String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String digits = "0123456789";

        String allCharacters = lowerCase + upperCase + digits;

        int passwordLength = rnd.nextInt(maxLength - minLength + 1) + minLength;

        StringBuilder passwordBuilder = new StringBuilder(passwordLength);
        for (int i = 0; i < passwordLength; i++) {
            int randomIndex = rnd.nextInt(allCharacters.length());
            char randomChar = allCharacters.charAt(randomIndex);
            passwordBuilder.append(randomChar);
        }

        return passwordBuilder.toString();
	}

}
