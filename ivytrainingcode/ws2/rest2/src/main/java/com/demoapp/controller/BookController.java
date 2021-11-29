package com.demoapp.controller;
import java.util.*;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.demoapp.service.Book;
import com.demoapp.service.BookService;
import com.demoapp.service.BookServiceImp;
//curd operation with json
@Path("/books")
public class BookController {
		private BookService bookService=new BookServiceImp();
		
		//get all the books
		@GET
		@Produces(MediaType.APPLICATION_JSON)
		public List<Book> getAllBooks(){
			return bookService.getAllBooks();
		}
		//get an book
		@GET
		@Path("/{bookId}")
		@Produces(MediaType.APPLICATION_JSON)
		public Book getAnBook(@PathParam(value = "bookId")int bookId){
			return bookService.getBookById(bookId);
		}
		
		//method post the book
		@POST
		@Produces(MediaType.APPLICATION_JSON)
		@Consumes(MediaType.APPLICATION_JSON)
		public Book postAnBook(Book book){
			return bookService.addBook(book);
		}
		
		//update
		@PUT
		@Produces(MediaType.APPLICATION_JSON)
		@Consumes(MediaType.APPLICATION_JSON)
		@Path("/{bookId}")
		public Book updateAnBook(@PathParam(value = "bookId")int bookId ,Book book){
			book.setId(bookId);
			return bookService.updateBook(book);
		}
		//delete the book
		
		@DELETE
		@Path("/{bookId}")
		@Produces(MediaType.APPLICATION_JSON)
		public Book deleteAnBook(@PathParam(value = "bookId")int bookId){
			return bookService.removeBook(bookId);
		}
}






