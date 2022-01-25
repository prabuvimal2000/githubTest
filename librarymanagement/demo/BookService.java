package com.librarymanagement.demo;

import java.util.List;

public interface BookService {

	List<BookDetails> getBookDeatils();

	BookDetails addBookDetails(BookDetails newBook);

	BookDetails updateBookDetails(BookDetails newBook);

	void deleteBookbyId(String bookId);

	BookDetails getDetailisBookbyId(String bookId);

}
