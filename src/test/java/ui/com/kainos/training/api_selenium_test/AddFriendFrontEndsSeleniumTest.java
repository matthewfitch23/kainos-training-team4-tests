package ui.com.kainos.training.api_selenium_test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AddFriendFrontEndsSeleniumTest extends BaseTest {
	
	@Test
	public void testUnsuccessfulFriendCreationForMissingName() {
		homePage.enterFriendandSubmit("");
		assertEquals("http://localhost:8900/login/HomePage", driver.getCurrentUrl());
	}
	
	@Test
	public void testSuccessfulFriendCreation() {
		homePage.enterFriendandSubmit("Alfie");
		assertEquals("http://localhost:8900/login/HomePage/FriendAdded", driver.getCurrentUrl());
	}
	
	
}
