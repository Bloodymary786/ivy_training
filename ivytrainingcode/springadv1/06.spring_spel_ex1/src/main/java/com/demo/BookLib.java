package com.demo;

import java.util.List;

public class BookLib {
	private List<Book> allBooks;
	private Book firstBook;

	public void setAllBooks(List<Book> allBooks) {
		this.allBooks = allBooks;
	}

	public void setFirstBook(Book firstBook) {
		this.firstBook = firstBook;
	}
	public void printBookLib() {
		System.out.println("---first book-----");
		System.out.println(firstBook);
		
		System.out.println("-----alll books-----");
		for(Book temp: allBooks) {
			System.out.println(temp);
		}
	}
}
