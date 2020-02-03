package com.example.friendsList.controller;

import com.example.friendsList.domain.*;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FriendController {

	FriendsRepository repository = new FriendsRepository();

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String friends(Model model) {

		Friend friend1 = new Friend("firstName", "lastName");
		repository.addFriend(friend1);
		model.addAttribute("friend", repository.getFriendRepository());

		return "friends";
	}

	@RequestMapping(value = "/add")
	public String friendsSubmit(@RequestParam(name="name")String name, Model model) {
		String[] nameParts = name.split(" ");
		String firstName = nameParts[0];
		String lastName = nameParts[1];
		repository.addFriend(new Friend(firstName, lastName));
		model.addAttribute("friend", repository.getFriendRepository());
	
		return "friends";
	}

}
