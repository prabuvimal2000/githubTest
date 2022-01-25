package com.librarymanagement.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LibraryManagement 
{
	@Autowired
	private BookService service;
	
	@GetMapping("/api/books")
	public List<BookDetails> getAllBookDetails()
	{
		return service.getBookDeatils();
	}
	@GetMapping("/api/books/{bookId}")
	public BookDetails getABookDetails(@PathVariable("bookId") String id)
	{
		return service.getDetailisBookbyId(id);
	}
	
	@PostMapping ("/api/books")// http://localhost:8080/api/books
	public BookDetails addBook(@RequestBody BookDetails newBook)
	{
		return service.addBookDetails(newBook);
	}
	@PutMapping("/api/books")
	public BookDetails updateBook(@RequestBody BookDetails newBook)
	{
		return service.updateBookDetails(newBook);
	}
	
	@DeleteMapping("/api/books/{bookId}")
	public ResponseEntity<HttpStatus> productIdDetails(@PathVariable("bookId") String id) 
	{
		try
		{
			service.deleteBookbyId(id);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception exception)
		{
		    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
