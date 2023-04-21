package org.example.test;
import java.util.Set;

import org.example.domain.Book;

public class SetTest {
	private Set<Book> bookList;
	
	public void setBookList(Set<Book> bookList) {
		this.bookList = bookList;
	}
	public void addBook(Book book) {
		if( this.bookList != null ) {
			this.bookList.add(book);
		}
	}
	public void addBooks(Book[] arr) {
		if (this.bookList != null) {
			if (arr != null) {
				for (Book book : arr)
					this.bookList.add(book);
			}
		}
	}

	public Book findBook(int id) {
		if (this.bookList != null) {
			for (Book book : bookList) {
				if( book.getId() == id )
					return book;
			}
		}
		return null;
	}

	public boolean removeBook(int bookId) {
		if (this.bookList != null) {
			Book key = new Book();
			key.setId(bookId);
			if (this.bookList.contains(key)) {
				this.bookList.remove(key);
				return true;
			}
		}
		return false;
	}

	public void printBooks() {
		if (this.bookList != null) 
			this.bookList.forEach(System.out::println);
	}
}
