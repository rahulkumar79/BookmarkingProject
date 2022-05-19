package com.rahul.thrillio.dao;

import com.rahul.thrillio.DataStore;
import com.rahul.thrillio.entities.Bookmark;
import com.rahul.thrillio.entities.UserBookmark;

public class BookmarkDao {
	public Bookmark[][] getBookmarks() {
		return DataStore.getBookmarks();
	}

	public void saveUserBookmark(UserBookmark userBookmark) {
		DataStore.add(userBookmark);
		
	}

}
