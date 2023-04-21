package Exceptions;

public class DuplicateIsbnNumberfFound extends Exception{
	
	public DuplicateIsbnNumberfFound() {
		this("Please enter unique ISBN number !! ");
	}
	public DuplicateIsbnNumberfFound(String msg){
		super(msg);
	}
}
