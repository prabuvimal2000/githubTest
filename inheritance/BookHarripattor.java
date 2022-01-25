
/*
 * Program for print the book name,author name,book price,email,gender and quantity of the book.
 * @author Prabu M
 * @since Jun 29 2021
 */
package inheritance;

public class BookHarripattor {
	public static void main(String[] args)
	{
		AuthorHarripator book = new AuthorHarripator("Puganesh","pugan9812@gmail.com",'M');
	    Book book1 = new Book(book,"Photographics");
	    book1.setPrice(1500.0);
	    book1.setQtyInStock(5);
	    System.out.println("The Book name is : "+book1.getBookName()+"\nBook Price : "+book1.getPrice()+"\nQuantity of the book is :"+book1.getQtyInStock());
	    System.out.println("The author name :"+book.getName()+"\nThe email id : "+book.getEmail()+"\ngender : "+book.getGender());
	}
}
