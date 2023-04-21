package org.example.utils;

import java.util.Comparator;

import org.example.domain.Book;

public class IdComparator implements Comparator<Book>{
	@Override
	public int compare(Book b1, Book b2) {
		return b1.getId() - b2.getId();
	}
}
