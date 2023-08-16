package com.test.question.Q092;

class Book {
	private String title;
	private int price;
	private String author;
	private String publisher;
	private String pubYear = "2019";
	private String isbn;
	private int page;

	// getter, setter



	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		if (title == null || title.isEmpty() || title.length() < 50) {
			
			this.title = title;
		} 
			
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if (price >=0 && price <=1000000) {
				this.price = price;
		}
			
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getPubYear() {
		return pubYear;
	}


	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		if (page >= 1) {
			
			this.page = page;
		}
	}
	
	public String info() {
		String temp = "";
		
		temp += "제목: " + this.title  + "\n";
		temp += "가격: " + this.price + "\n";
		temp += "저자: " + this.author+ "\n";
		temp += "출판사: " + this.publisher+ "\n";
		temp += "발행년도: " + this.pubYear + "년" + "\n";
		temp += "ISBN: " + this.isbn+ "\n";
		temp += "페이지: " + this.page+ "\n";
		
		
		
	
				
		return temp;
	
  }
}