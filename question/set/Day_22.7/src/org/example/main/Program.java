package org.example.main;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;
import org.example.domain.Book;
import org.example.test.SetTest;
public class Program {
	private static Scanner sc = new Scanner(System.in);
	private static Book[] getArray() {
		Book[] arr = new Book[ 10 ];
		arr[ 0 ] = new Book(1083, "The Alchemist", "Paulo Coelho", "HarperCollins", 901.14f);
		arr[ 1 ] = new Book(461, "The Da Vinci Code", "Dan Brown", "Doubleday", 1065.13f);
		arr[ 2 ] = new Book(932, "Harry Potter and the Philosopher's Stone", "J.K. Rowling", "Bloomsbury", 819.14f);
		arr[ 3 ] = new Book(1159, "The Hunger Games", "Suzanne Collins", "Scholastic Press", 737.15f);
		arr[ 4 ] = new Book(691, "The Girl with the Dragon Tattoo", "Stieg Larsson", "Norstedts Förlag", 1229.13f);
		arr[ 5 ] = new Book(115, "The Lord of the Rings", "J.R.R. Tolkien", "George Allen & Unwin", 1639.11f);
		arr[ 6 ] = new Book(574, "The Catcher in the Rye", "J.D. Salinger", "Little, Brown and Company", 983.14f);
		arr[ 7 ] = new Book(230, "The Fault in Our Stars", "John Green", "Dutton Books", 1147.13f);
		arr[ 8 ] = new Book(864, "Gone Girl", "Gillian Flynn", "Crown Publishing Group", 901.14f);
		arr[ 9 ] = new Book(383, "Pride and Prejudice", "Jane Austen", "T. Egerton, Whitehall", 655.15f);
		return arr;
	}
	private static void acceptRecord( Book book ) {
		if( book != null ) {
			System.out.print("Enter book id	:	");
			book.setId( sc.nextInt());
			System.out.print("Enter book name	:	");
			sc.nextLine();
			book.setName(sc.nextLine());
			System.out.print("Enter book author	:	");
			book.setAuthor(sc.nextLine());
			System.out.print("Enter book publisher	:	");
			book.setPublisher(sc.nextLine());
			System.out.print("Enter price	:	");
			book.setPrice(sc.nextFloat());
		}
	}
	private static void acceptRecord(int[] bookId) {
		if( bookId != null ) {
			System.out.print("Enter book id	:	");
			bookId[ 0 ] = sc.nextInt();
		}
	}
	private static void printRecord(Book book) {
		if( book != null )
			System.out.println( book.toString());
		else
			System.out.println("Book not found.");
	}
	private static void printRecord(boolean removedStatus) {
		if( removedStatus )
			System.out.println("Book is removed");
		else
			System.out.println("Book not found.");
	}
	public static int menuList( ) {
		System.out.println("0.Exit");
		System.out.println("1.Add Book(s)");
		System.out.println("2.Find Book");
		System.out.println("3.Remove Book");
		System.out.println("4.Print Books[Sorted]");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}
	public static void main(String[] args) {
		int choice;
		int[] bookId = new int[ 1 ];
		SetTest test = new SetTest();
		//test.setBookList( new TreeSet<>( new IdComparator()));
		//test.setBookList( new TreeSet<>( ) );
		//test.setBookList( new HashSet<>());
		test.setBookList( new LinkedHashSet<>());
		Book book = null;
		while( ( choice = Program.menuList( ) ) != 0) {
			switch( choice ) {
			case 1:
				//book = new Book();
				//Program.acceptRecord( book );
				//test.addBook( book );
				
				Book[] arr = Program.getArray( );
				test.addBooks( arr );
				break;
			case 2:
				Program.acceptRecord( bookId );
				book = test.findBook( bookId[ 0 ] );
				Program.printRecord( book );
				break;
			case 3:
				Program.acceptRecord( bookId );
				boolean removedStatus = test.removeBook( bookId[ 0 ] );
				Program.printRecord( removedStatus );
				break;
			case 4:
				test.printBooks( );
				break;
			}
		}
	}
}
