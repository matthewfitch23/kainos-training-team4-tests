package ui.com.kainos.training.api_selenium_test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.kainos.training.blackbox.client.FriendClient;

public class AddFriendFrontEndsSeleniumTest extends BaseTest {
	
	@Test
	public void testUnsuccessfulFriendCreationForMissingName() {
		homePage.enterFriendandSubmit("");
		// Ensure page does not change until a name is entered 
		assertEquals("http://localhost:8900/login/HomePage", driver.getCurrentUrl());
	}
	
	@Test
	public void testSuccessfulFriendCreation() {
		String alfie = "Alfie";
		homePage.enterFriendandSubmit(alfie);
		assertTrue(friendAddedPage.getMessage()
				.contains(alfie + " has been added to your friend list!"));
	}
	
	@Test
	public void testDuplicateFriendAttempt() {
		String doop = "Doop";
		homePage.enterFriendandSubmit(doop);
		String url = "http://localhost:8900/add-friend-";
		
		assertEquals(driver.getCurrentUrl(), url + "success");
		assertTrue(friendAddedPage.getMessage()
				.contains(doop + " has been added to your friend list!"));
		
		homePage.enterFriendandSubmit(doop); // duplicate entered
		
		assertEquals(driver.getCurrentUrl(), url + "failure");
		assertTrue(friendNotAddedPage.getMessage()
				.contains(doop + " is already in your friend list!"));
	}
	
	
}
