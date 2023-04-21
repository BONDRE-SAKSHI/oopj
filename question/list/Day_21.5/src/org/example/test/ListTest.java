package org.example.test;
import java.util.Comparator;
import java.util.List;

import org.example.domain.Book;

public class ListTest {
	private List<Book> bookList;

	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}

	/* public void addBook(Book book) {
		if (this.bookList != null) {
			this.bookList.add(book);
		}
	} */
	
	public void addBooks(Book[] arr) {
		if (this.bookList != null) {
			if (arr != null) {
				for (Book book : arr)
					this.bookList.add(book);
			}
		}
	}

	public Book findBook(int bookId) {
		if (this.bookList != null) {
			Book key = new Book();
			key.setId(bookId);
			if (this.bookList.contains(key)) {
				int index = this.bookList.indexOf(key);
				Book value = this.bookList.get(index);
				return value;
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

	public void printBooks(Comparator<Book> comparator) {
		if (this.bookList != null) {
			this.bookList.sort(comparator);
			this.bookList.forEach(System.out::println);
		}
	}
}
