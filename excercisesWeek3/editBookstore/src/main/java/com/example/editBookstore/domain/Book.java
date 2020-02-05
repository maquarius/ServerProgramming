package com.example.editBookstore.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private Long id;
	private String title, author;
	private int year;
	private long ISBN;

	public Book() {

	}

	public Book(String title, String author, int year, long iSBN) {
		super();
		this.title = title;
		this.author = author;
		this.year = year;
		ISBN = iSBN;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", year=" + year + ", ISBN=" + ISBN
				+ "]";
	}

	
}
