package com.librarymanagement.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class BookDetails {
	 @Id
	 String bookId;
	 String title,author,publisher,no_Of_Pages,no_Of_Copies;
	 
	public BookDetails() {
		super();
	}
	public BookDetails(String bookId, String title, String author, String publisher, String no_Of_Pages, String no_Of_Copies) {
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.no_Of_Pages = no_Of_Pages;
		this.no_Of_Copies = no_Of_Copies;
	}
	
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getNo_Of_Pages() {
		return no_Of_Pages;
	}
	public void setNo_Of_Pages(String no_Of_Pages) {
		this.no_Of_Pages = no_Of_Pages;
	}
	public String getNo_Of_Copies() {
		return no_Of_Copies;
	}
	public void setNo_Of_Copies(String no_Of_Copies) {
		this.no_Of_Copies = no_Of_Copies;
	}
}
/*public String getBookId() {
return bookId;
}
public void setBookId(String bookId) {
this.bookId = bookId;
}
public String getBookTitle() {
return bookTitle;
}
public void setBookTitle(String bookTitle) {
this.bookTitle = bookTitle;
}
public String getAuthorName() {
return authorName;
}
public void setAuthorName(String authorName) {
this.authorName = authorName;
}
public String getPublisher() {
return publisher;
}
public void setPublisher(String publisher) {
this.publisher = publisher;
}
public String getNo_Of_Pages() {
return no_Of_Pages;
}
public void setNo_Of_Pages(String no_Of_Pages) {
this.no_Of_Pages = no_Of_Pages;
}
public String getNo_Of_Copies() {
return no_Of_Copies;
}
public void setNo_Of_Copies(String no_Of_Copies) {
this.no_Of_Copies = no_Of_Copies;
} */
