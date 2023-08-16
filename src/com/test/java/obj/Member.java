package com.test.java.obj;

public class Member {
	
	private String id;
	private String pwd;
	private String name;
	private int lv;
	
	//셍성자 vs Setter
	//1. 생성자는 초기화 하는 역할
	//2. Setter는 초기화 이후에 수정하는 역할
	
//	public Member(String id, String pwd, String name, int lv) {
//		this.id = id;
//		this.pwd = pwd;
//		this.name = name;
//		this.lv = lv;
//	}
	
	
	
	public Member(String id, String pwd, String name, int lv) {
		//super();
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.lv = lv;
	}

	public String info() {
		
		return String.format("아이디 (%s), 암호(%s), 이름(%s), 등급(%d)", this.id, this.pwd, this.name, this.lv);
		
	}

	
}
