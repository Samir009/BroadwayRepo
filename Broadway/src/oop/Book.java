package oop;

public class Book {
	int page;
	double price;
	String name;
	String publication;
	String author;
	String isbn;
	String publication_date;
	String edition;
	String category;

//	public Book(int page, double price, String name, String publication, String author, String isbn,
//			String publication_date, String edition, String category) {
//		super();
//		this.page = page;
//		this.price = price;
//		this.name = name;
//		this.publication = publication;
//		this.author = author;
//		this.isbn = isbn;
//		this.publication_date = publication_date;
//		this.edition = edition;
//		this.category = category;
//	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPublication() {
		return publication;
	}

	public void setPublication(String publication) {
		this.publication = publication;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getPublication_date() {
		return publication_date;
	}

	public void setPublication_date(String publication_date) {
		this.publication_date = publication_date;
	}

	public String getEdition() {
		return edition;
	}

	public void setEdition(String edition) {
		this.edition = edition;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public static void main(String[] args) {
//
//		Book b = new Book(12, 2000, "java", "detial", "samir", "1234", "jan-2020", "10th", "academic");
//
//		System.out.println(b.author);

		Book b = new Book();
		b.author = "hello";

		System.out.println(b.author);

	}

}
