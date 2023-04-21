package org.example.main;

import org.example.Comparators.AuthorComparator;
import org.example.Comparators.IsbnComparator;
import org.example.Comparators.TitleComparator;
import org.example.domain.Book;
import org.example.utils.Tester;
import Exceptions.*;

import java.util.ArrayList;
import java.util.Comparator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Manager {
	static Scanner sc = new Scanner(System.in);
	static Tester tester = new Tester(new ArrayList<Book>());

	public void addBook() throws BookTitleTooShortException,DuplicateIsbnNumberfFound {
		Book book = new Book();

		
		try {
			System.out.println("Enter title of your book :");
			String title = sc.nextLine();
			if (title.length() < 5)
				throw new BookTitleTooShortException();
			book.setTitle(title);
			System.out.println("Enter Author of your book :");
			book.setAuthor(sc.nextLine());
			System.out.println("Enter ISBN of your book :");
			book.setIsbn(sc.nextLine());
		
			tester.addBookToList(book);
		} catch (BookTitleTooShortException e) {
			throw new BookTitleTooShortException();
		}

	}

	// show main menu
	public int showMenu() {

		System.out.println("1. Add Book");
		System.out.println("2. Display Book");
		System.out.println("3. Remove Book");
		System.out.println("4. Compare by ");
		System.out.println("0. Exit ");
		System.out.print("Enter your choice :");

		return sc.nextInt();
	}

	// show and main menu
	public void runMenu() {
		int option;
		while (true) {

			try {
				option = showMenu();
				if (option == 0) {
					break;
				}
				switch (option) {
				case 1:
					sc.nextLine();
					this.addBook();
					break;
				case 2:
					tester.DisplayAllBooks();
					break;
				case 3:
					sc.nextLine();
					System.out.println("Enter the isbn of book which you wish to remove :");
					tester.removeBookFromList(sc.nextLine());
					break;
				case 4:
					// call runsub-menu
					runSubmenu();

					break;

				default:
					System.out.println("Invalid choice");
					break;
				}
			} catch (InputMismatchException e) {
				sc.nextLine();
				System.out.println("Invalid input");
			} catch (BookTitleTooShortException e) {
				System.out.println(e.getMessage());
			}catch(DuplicateIsbnNumberfFound e) { 
				System.out.println(e.getMessage());
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public int showSubmenu() throws InputMismatchException {
		System.out.println("1. Compare by Title");
		System.out.println("2. Compare by Author");
		System.out.println("3. Compare by ISBN");
		System.out.println("0. Exit ");
		System.out.print("Enter your choice :");
		try {
			return sc.nextInt();
		} catch (InputMismatchException e) {

			throw new InputMismatchException();
		}
	}

	// show and run sub-menu
	public void runSubmenu() throws InputMismatchException {
		int option;

		while (true) {
			try {
				option = showSubmenu();
				if (option == 0) {
					break;
				}
				Comparator<Book> comparator = null;
				switch (option) {
				case 1:
					comparator = new TitleComparator();

					break;
				case 2:
					comparator = new AuthorComparator();
					break;
				case 3:
					comparator = new IsbnComparator();
					break;
				case 4:

					break;

				default:
					System.out.println("Invalid choice");
					break;
				}
				tester.printAll(comparator);

			} catch (InputMismatchException e) {
				throw new InputMismatchException();
			}
		}
	}
}
