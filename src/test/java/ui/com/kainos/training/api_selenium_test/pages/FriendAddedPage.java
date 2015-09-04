package ui.com.kainos.training.api_selenium_test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FriendAddedPage {
	
	private WebDriver driver;
	
	public static final By FRIEND_ADDED_MESSAGE = By.id("message");
	
	public FriendAddedPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getMessage() {
		WebElement message = driver.findElement(FRIEND_ADDED_MESSAGE);
		return message.getText();
	}
}
