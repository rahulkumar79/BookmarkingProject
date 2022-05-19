package com.rahul.thrillio;

import com.rahul.thrillio.entities.Bookmark;
import com.rahul.thrillio.entities.User;
import com.rahul.thrillio.managers.BookmarkManager;
import com.rahul.thrillio.managers.UserManager;

public class Launch {
	
	private static User[] users;
	private static Bookmark[][] bookmarks;
	
	private static void loadData() {
		System.out.println("1. loading data ...");
		DataStore.loadData();
		
		users  = UserManager.getInstance().getUsers();
		bookmarks = BookmarkManager.getInstance().getBookmarks();
		
		//System.out.println("Printing data ...");
		//printUserData();
		//printBookamrkData();
	}


	private static void printBookamrkData() {
		for (Bookmark[] bookmarkList : bookmarks) {
			for (Bookmark bookmark : bookmarkList) {
				System.out.println(bookmark);
			}
		}
	}


	private static void printUserData() {
		for (User user : users) {
			System.out.println(user);
		}
		
	}
	
	private static void start() {
		//System.out.println("\n2. loading data ...");
		for(User user : users) {
			View.browse(user, bookmarks);
		}
		
	}


	public static void main(String[] args) {
		loadData();
		start();

	}
	
}
