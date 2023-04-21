package org.example.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

import org.example.domain.Book;
import org.example.main.Manager;

import Exceptions.DuplicateIsbnNumberfFound;


public class Tester implements Operations {
	List<Book> booklist; // array , linked

	public Tester(List<Book> bookslist) {
		this.booklist = bookslist;
		booklist.add(new Book("C programming","Yashwant Kanitkar","123"));
		booklist.add(new Book("Electricals Instrumentation","A.K. Sawney","432"));
		booklist.add(new Book("Harry Potter","J.K Rowling","234"));
	}

	

	@Override
	public boolean addBookToList(Book book) throws DuplicateIsbnNumberfFound{
		for (Book bk : booklist) {
			if(bk.getIsbn().equals(book.getIsbn()))
			throw new DuplicateIsbnNumberfFound();
		}
		if (this.booklist != null)
			booklist.add(book);
		return true;
	}

	@Override
	public void DisplayAllBooks() {
		this.booklist.forEach(System.out::println);

	}
	
	@Override
	public boolean removeBookFromList(String isbn) {
		Book key= new Book();
		key.setIsbn(isbn);
		if(this.booklist.contains(key)) {
			int index= this.booklist.indexOf(key);
			this.booklist.remove(index);
			return true;
		}
		return false;
		
	}

	
	public void printAll(Comparator<Book> comp) {
		this.booklist.sort(comp);
		this.booklist.forEach(System.out::println);
	}
	




	
}
