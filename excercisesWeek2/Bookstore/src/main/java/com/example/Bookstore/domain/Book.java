package com.example.Bookstore.domain;

public class Book {
	private String title;
	private String author;
	private int year;
	private long ISBN;
	private double price;

	public Book() {

	}

	public Book(String title, String author, int year, long iSBN, double price) {
		super();
		this.title = title;
		this.author = author;
		this.year = year;
		ISBN = iSBN;
		this.price = price;
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

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public long getISBN() {
		return ISBN;
	}

	public void setISBN(long iSBN) {
		ISBN = iSBN;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", year=" + year + ", ISBN=" + ISBN + ", price=" + price
				+ "]";
	}

	
}
