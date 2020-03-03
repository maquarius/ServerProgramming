package com.example.MariusBookREST.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import net.minidev.json.annotate.JsonIgnore;

@Entity
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String author, title;
	private int year;
	private long ISBN;

	@ManyToOne
	@JsonIgnore
	@JoinColumn (name = "categoryid")
	private Category category;
	
	public Book() {

	}
	
	public Book(String author, String title, int year, long iSBN, Category category) {
		super();
		this.author = author;
		this.title = title;
		this.year = year;
		ISBN = iSBN;
		this.category = category;
	}


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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
	

	}
