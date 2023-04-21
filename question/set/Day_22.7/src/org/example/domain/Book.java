package org.example.domain;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class Book implements Comparable<Book>{
	private int id;
	private String name;
	private String author;
	private String publisher;
	private float price;
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public int compareTo(Book other) {
		return this.id - other.id;
	}
	@Override
	public String toString() {
		return String.format("%-10d%-45s%-20s%-30s%-8.2f", this.id, this.name, this.author, this.publisher, this.price);
	}
}
