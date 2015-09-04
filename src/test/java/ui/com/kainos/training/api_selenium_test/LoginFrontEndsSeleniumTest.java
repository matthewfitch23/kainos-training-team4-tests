package ui.com.kainos.training.api_selenium_test;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginFrontEndsSeleniumTest extends BaseTest {

	private static final String INCORRECT_PASSWORD = "incorrect passowrd";
	private static final String CORRECT_PASSWORD = "password";
	private static final String CORRECT_USERNAME = "admin";

	@Before
	public void setup() {
		driver.get("http://localhost:8900/login");
	}

	@Test
	public void testSuccessfulLogin() {
		loginPage.enterCredentialsAndSubmit(CORRECT_USERNAME, CORRECT_PASSWORD);
		assertTrue(homePage.getPageMessage().contains("success"));
	}

	@Test
	public void testFailedLogin() {
		loginPage.enterCredentialsAndSubmit(CORRECT_USERNAME, INCORRECT_PASSWORD);
		assertTrue(loginFailed.getMessage().contains("Failed"));
	}
}
