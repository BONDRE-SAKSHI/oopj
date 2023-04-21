package org.example.domain;

import java.util.Objects;

public class Book {
	private String title;
	private String author;
	private String isbn;
	
	public Book(){
		
	}
	
	public Book(String title, String author, String isbn) {
	
		this.title = title;
		this.author = author;
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	@Override
	public String toString() {
		return String.format("%-30s%-30s%-30s",this.getTitle(), this.getAuthor(), this.getIsbn());
	}

	




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		//downcating
		return Objects.equals(isbn, other.isbn);
	}
	

	

	
//	@Override
//	public boolean equals(Object obj) {
//		// TODO Auto-generated method stub
//		
//		
//		Book book = (Book) obj;
//		if(book.getIsbn().equals(isbn))
//			return true;
//		return false;
//	
//	}
//	
	
	
	

}
