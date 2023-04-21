package org.example.utils;

import org.example.domain.Book;

import Exceptions.DuplicateIsbnNumberfFound;

public interface Operations {
  boolean addBookToList(Book book) throws DuplicateIsbnNumberfFound;
  void  DisplayAllBooks() ;
  boolean removeBookFromList(String isbn);
  
}
