package com.demo;

import java.util.*;

public class BookCollection {

	public List<Book> bookList;

	public Book getFirstBook() {
		return bookList.get(0);

	}
	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}
}
