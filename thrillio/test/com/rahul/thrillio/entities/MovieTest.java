package com.rahul.thrillio.entities;

import static org.junit.Assert.*;

import org.junit.Test;

import com.rahul.thrillio.constants.MovieGenre;
import com.rahul.thrillio.managers.BookmarkManager;

public class MovieTest {

	@Test
	public void testIsKidFriendlyEligible() {
		// test 1: for horror movies-- false
		Movie movie = BookmarkManager.getInstance().createMovie(3000, "Citizen Kane", "", 1941,
				new String[] { "Orson Welles", "Joseph Cotten" }, new String[] { "Orson Welles" }, MovieGenre.HORROR,
				8.5);

		boolean isKidFriendlyEligible = movie.isKidFriendlyEligible();
		assertFalse("for horror movie genre - isKidFriendlyEligible() must return false", isKidFriendlyEligible);

		// test 2: for thriller movies-- false
		movie = BookmarkManager.getInstance().createMovie(3000, "Citizen Kane", "", 1941,
				new String[] { "Orson Welles", "Joseph Cotten" }, new String[] { "Orson Welles" }, MovieGenre.THRILLERS,
				8.5);

		isKidFriendlyEligible = movie.isKidFriendlyEligible();
		assertFalse("for thriller movie genre - isKidFriendlyEligible() must return false", isKidFriendlyEligible);
	}

}
