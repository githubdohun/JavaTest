package com.test.question.Q093;

class Note  {
	   private String size; //크기
	   private String color; //표지색상
	   private int page; //페이지수
	   private String owner; //소유자 이름
	   private int price = 500; //가격 //기본가격 500원

	   private String thickness;
	   //setter, getter 구현

	   


	public void setSize(String size) { //문자열 equals
		if (size.equals("A3")
				|| size.equals("A4")
				|| size.equals("A5")
				|| size.equals("B3")
				|| size.equals("B4")
				|| size.equals("B5")) {
			
			this.size = size;
			
			if (size.equals("A3")) {
				this.price += 400;
			} else if (size.equals("A4")){
				this.price += 200;		
			} else if (size.equals("B3")) {
				this.price += 500;		
			} else if (size.equals("B4")) {
				this.price += 300;		
			} else if (size.equals("B5")) {
				this.price += 100;		
			} 
			
		}
		
	}


	public void setColor(String color) {
		
		if (color.equals("검정색") 
				|| color.equals("흰색") 
				|| color.equals("노란색") 
				|| color.equals("파란색")) {
			
			this.color = color;
			
			if (color.equals("검정색")) {
				this.price += 100;
			} else if (color.equals("노란색")) {
				this.price += 200;	
			} else if (color.equals("파란색")) {
				this.price += 200;	
			}
			
		}

	}


	public void setPage(int page) {
		if (10 <= page && page <=200) {
			//if (page < 10 && page > 200) {
		
			// return;
			
			//} {
			//this.page = page;
		//}
			
		}
		
		if (10 <= page && page <= 50) {
			this.thickness = "얇은";
		} else if (51 <= page && page <= 100) {
			this.thickness = "보통";
		} else if (101 <= page && page <= 200) {
			this.thickness = "두꺼운";
		}
		this.page = page;
		
		this.price += (page - 10) * 10;
	}

	public void setOwner(String owner) {
		
		//유효성 검사
		// - 검사할 기준 1개 > 무관
		// - 검사할 기준 N개 > 잘못된 것을 찾기
		//if (owner.length() >= 2 && owner.length() <= 5) {
			
//			boolean result = false;
//			
//			for (int i = 0; i<owner.length(); i++) {
//				
//				char c = owner.charAt(1);
//				
//				if (c >= '가' && c <= '힝') {
//					result = true;
//				} else {
//					result = false;
//					break;
//				}
//				
//			}
//			if (result) {
//			}
			
			if (owner.length() < 2 || owner.length() > 5) {
				return;
			}
			
			for (int i=0; i<owner.length(); i++) {
				
				char c =owner.charAt(i);
				
				if (c < '가' || c > '힣') {
					return;
				}
			}
			this.owner = owner;
	}


	
	public String info() {
		String temp = "";
		//문자열 (null)
		// if (owner != null) > 연산자 사용
		
		//문자열 ("")
		// if (owner.equals("")) > 메소드 사용
		
		if (this.owner != null) {
			temp += "■■■■■■ 노트 정보 ■■■■■■\n";
		
		temp +="소유자 : " + this.owner + "\n";
		temp += String.format("특성 : %s %s %s노트\n", this.color, this.thickness, this.size);
		temp += String.format("가격 : %,d원\n", this.price);
		temp +=	"■■■■■■■■■■■■■■■■■■■■■■";
		} else {
			temp += "■■■■■■ 노트 정보 ■■■■■■\n";
			temp += "주인 없는 노트\n";
			temp += "■■■■■■■■■■■■■■■■■■■■■■\n";
		}
		
		
		
		
	
				
		return temp;
	
  }
}
	   
	   
