package com.librarymanagement.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImplemet implements BookService
{
    @Autowired
    BookRepository book;
    
    public BookServiceImplemet()
    {
		super();
	}

	@Override
	public List<BookDetails> getBookDeatils()
	{
		return book.findAll();
	}
	
	@Override
	 public BookDetails getDetailisBookbyId(String bookId)
    {
    	BookDetails getBookbyId=book.getById(bookId);
    	return getBookbyId ;   
    }
    
    @Override
	public BookDetails addBookDetails(BookDetails newBook)
	{
		book.save(newBook);
		return newBook;
	}
    
    @Override
    public BookDetails updateBookDetails(BookDetails updateBook)
    {
    	book.save(updateBook);
    	return updateBook;
    }
    
    @Override
    public void deleteBookbyId(String bookId)
    {
    	BookDetails deleteBook=book.getOne(bookId);
    	book.delete(deleteBook);
    }
}
