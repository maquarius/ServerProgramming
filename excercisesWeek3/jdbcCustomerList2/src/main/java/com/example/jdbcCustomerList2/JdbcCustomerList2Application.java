package com.example.jdbcCustomerList2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;


@SpringBootApplication
public class JdbcCustomerList2Application {
	private static final Logger log = LoggerFactory.getLogger(JdbcCustomerList2Application.class);

	public static void main(String[] args) {
		SpringApplication.run(JdbcCustomerList2Application.class, args);
	}
	
	@Bean
	public CommandLineRunner addBooks(JdbcTemplate jdbcTemplate) {
		return (args) -> {
			log.info("save a couple of Customers");
			jdbcTemplate.update("INSERT INTO Customer(id, firstName, lastName, address) VALUES (?,?,?,?)",
				"1","John", "West","Street 156");	
		};
		};

}
