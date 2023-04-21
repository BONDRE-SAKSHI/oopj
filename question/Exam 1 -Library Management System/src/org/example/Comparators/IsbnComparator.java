package org.example.Comparators;

import java.util.Comparator;
import org.example.domain.Book;
public class IsbnComparator implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		return o1.getIsbn().compareToIgnoreCase(o2.getIsbn());
	}

}
