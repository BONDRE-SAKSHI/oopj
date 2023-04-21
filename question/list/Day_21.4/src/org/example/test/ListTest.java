package org.example.test;

import java.util.ArrayList;
import java.util.Comparator;

import org.example.domain.Book;

public class ListTest {
	private ArrayList<Book> bookList = new ArrayList<>();

	public void addBooks(Book[] arr) {
		if (arr != null) {
			for( Book book : arr )
				this.bookList.add( book );
		}
	}
	public Book findBook(int bookId) {
		Book key = new Book();
		key.setId(bookId);
		if( this.bookList.contains(key)) {
			int index =  this.bookList.indexOf(key);
			Book value = this.bookList.get(index);
			return value;
		}
		return null;
	}
	public boolean removeBook(int bookId) {
		Book key = new Book();
		key.setId(bookId);
		if( this.bookList.contains(key)) {
			this.bookList.remove(key);
			return true;
		}
		return false;
	}
	
	public void printBooks(Comparator<Book> comparator) {
		this.bookList.sort(comparator);
		this.bookList.forEach(System.out::println);
	}
}
