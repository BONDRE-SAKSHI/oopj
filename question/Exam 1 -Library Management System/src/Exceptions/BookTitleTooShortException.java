package Exceptions;

@SuppressWarnings("serial")
public class BookTitleTooShortException extends Exception {
    // Custom exception for book title that is too short
	public BookTitleTooShortException() {
		this("Book title is too short !! Please enter more than 5 charcter");
	}
    public BookTitleTooShortException(String message) {
        super(message);
    }
}
