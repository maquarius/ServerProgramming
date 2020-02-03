package com.example.friendsList.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FriendsRepository {
	private List<Friend> friendRepository;

	public FriendsRepository() {
		friendRepository = new ArrayList<>();
	}

	public List<Friend> getFriendRepository() {
		return friendRepository;
	}

	public void setFriendRepository(List<Friend> friendRepository) {
		this.friendRepository = friendRepository;
	}

	public void addFriend(Friend friend) {
		friendRepository.add(friend);
	}

	public List<Friend> getAll() {
		List<Friend> friendsList = new ArrayList<Friend>();
		for (Friend friend : friendRepository) {
			friendsList.add(friend);
		}
		return friendsList;
	}

}
