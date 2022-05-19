package com.rahul.thrillio.dao;

import com.rahul.thrillio.DataStore;
import com.rahul.thrillio.entities.User;

public class UserDao {
	public User[] getUsers() {
		return DataStore.getUsers();
	}

}
