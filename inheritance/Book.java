package inheritance;

public class Book {
	private String bookName;
	private double price;
	private int qtyInStock;
	private AuthorHarripator author;
	Book(AuthorHarripator author,String name)
	{
		this.author=author;
		bookName=name;
	}
public String getBookName() {
	return bookName;
}
public AuthorHarripator getAuthor() {
	return author;
}

public void setPrice(double price) {
	this.price = price;
}
public double getPrice() {
	return price;
}
public void setQtyInStock(int qtyInStock) {
	this.qtyInStock = qtyInStock;
}
public int getQtyInStock() {
	return qtyInStock;
}

}
