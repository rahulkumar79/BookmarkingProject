package com.rahul.thrillio.entities;

import static org.junit.Assert.*;

import org.junit.Test;

import com.rahul.thrillio.constants.BookGenre;
import com.rahul.thrillio.constants.MovieGenre;
import com.rahul.thrillio.managers.BookmarkManager;

public class BookTest {

	@Test
	public void testIsKidFriendlyEligible() {
		// test 1: for philosophy -- false
		Bookmark book = BookmarkManager.getInstance().createBook(4000, "Walden", 1854, "Wilder Publications",
				new String[] { "Henry David Thoreau" }, BookGenre.PHILOSOPHY, 4.3);

		boolean isKidFriendlyEligible = book.isKidFriendlyEligible();
		assertFalse("for philosophy book genre - isKidFriendlyEligible() must return false", isKidFriendlyEligible);

		// test 2: for selp_help book-- false
		book = BookmarkManager.getInstance().createBook(4000, "Walden", 1854, "Wilder Publications",
				new String[] { "Henry David Thoreau" }, BookGenre.SELF_HELP, 4.3);

		isKidFriendlyEligible = book.isKidFriendlyEligible();
		assertFalse("for horror movie genre - isKidFriendlyEligible() must return false", isKidFriendlyEligible);
	}

}
