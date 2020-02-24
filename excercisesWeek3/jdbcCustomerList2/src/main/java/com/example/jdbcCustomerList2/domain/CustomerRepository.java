package com.example.jdbcCustomerList2.domain;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class CustomerRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Transactional(readOnly=true)
	public List<Customer> findall(){
		return jdbcTemplate.query("SELECT * FROM Customer", new CustomerRowMapper());
		
	}
}
