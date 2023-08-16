package com.test.java.obj;

public class Ex41_Class {
	public static void main(String[] args) {
		
		//Pencil, PencilCase
		
		PencilCase pcase = new PencilCase();
		
		pcase.setColor("파란색");
		
		/*
		for (int i=0; i<5; i++) {
			
		Pencil p1 = new Pencil();
		p1.setHardness("HB");
		p1.setColor("검은색");
		
		pcase.getPencil() [i] = p1; // [index] : 인덱서 (indexer) - 표기볍
		
		}
		
		for (int i=0; i<5; i++) {
			System.out.println(pcase.getPencil()[i].info());
		}
		*/
		
		for (int i=0; i<5; i++) {
			Pencil p = new Pencil();
			p.setHardness("B");
			p.setColor("파란색");
			
			pcase.add(p);
			
			
		}
		
		
		System.out.println(pcase.info());
		Pencil p2 = pcase.get(2);
		System.out.println(pcase.info());
		
		
		String[] color = {"red", "blue", "yellow", "white", "pink", "purple", "green", "black"};
		
		//문자열은 난수가 안 되지만 배열 방 번호는 난수가 가능
		System.out.println(color[(int)(Math.random() * color.length)]);
		

	}

}
