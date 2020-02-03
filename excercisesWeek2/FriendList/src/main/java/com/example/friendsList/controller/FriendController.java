package com.example.friendsList.controller;

import com.example.friendsList.domain.*;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FriendController {

	public FriendsRepository repository = new FriendsRepository();

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String friends(Model model) {
		Friend friend1 = new Friend("sdhjsad", "shjdjad");
		repository.addFriend(friend1);
		model.addAttribute("friends", repository.getFriendRepository());

		return "friends";
	}

	@RequestMapping(value = "/index", method = RequestMethod.POST)
	public String friendsSubmit(@ModelAttribute Friend friend, Model model) {
		
		model.addAttribute("friends", friend);
		//repository.addFriend(new Friend(friends.getFirstName(), friends.getLastName()));

		return "friends";
	}

}
