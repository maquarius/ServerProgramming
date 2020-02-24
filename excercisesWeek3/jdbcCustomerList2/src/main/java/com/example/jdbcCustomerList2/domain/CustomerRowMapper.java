package com.example.jdbcCustomerList2.domain;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CustomerRowMapper implements RowMapper<Customer> {

	@Override
	public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
		Customer customer = new Customer();
		customer.setId(rs.getLong("id"));
		customer.setFirstName(rs.getString("firstName"));
		customer.setLastName(rs.getString("lastName"));
		customer.setAddress(rs.getString("address"));

		return customer;
	}
}
