package com.example.CustomerList.domain;

public class Customer {
	private String firstName;
	private String lastName;
	private Long customerid;
	private String password;
	private String email;

	public Customer() {
	}

	public Customer(String firstName, String lastName, Long customerid, String password, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.customerid = customerid;
		this.password = password;
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Long getCustomerid() {
		return customerid;
	}

	public void setCustomerid(Long customerid) {
		this.customerid = customerid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	};

	
}