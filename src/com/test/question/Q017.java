package com.test.question;

public class Q017 {
	public static void main(String[] args) {
		
		position("홍길동");
		position("홍길동", "유재석");
		position("홍길동", "유재석", "박명수");
		position("홍길동", "유재석", "박명수", "정형돈");
		
		
	}//main
	
	public static void position(String a) {
		System.out.println("사원: " + a);
		System.out.println();
		
	}
	
	public static void position(String a, String b) {
		System.out.println("사원: " + a);
		System.out.println("대리: " + b);
		System.out.println();
		
	}
	
	public static void position(String a, String b, String c) {
		System.out.println("사원: " + a);
		System.out.println("대리: " + b);
		System.out.println("과장: " + c);
		System.out.println();
		
	}
	
	public static void position(String a, String b, String c, String d) {
		System.out.println("사원: " + a);
		System.out.println("대리: " + b);
		System.out.println("과장: " + c);
		System.out.println("부장: " + d);
		
	}

}
