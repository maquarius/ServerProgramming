package com.example.friendsList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example"})
public class FriendsListApplication {

	public static void main(String[] args) {
		SpringApplication.run(FriendsListApplication.class, args);
	}

}
