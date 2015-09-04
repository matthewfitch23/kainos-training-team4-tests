package ui.com.kainos.training.api_selenium_test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FriendNotAddedPage {
	private WebDriver driver;
	
	public static final By FRIEND_NOT_ADDED_MESSAGE = By.id("message");
	
	public FriendNotAddedPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getMessage() {
		WebElement message = driver.findElement(FRIEND_NOT_ADDED_MESSAGE);
		return message.getText();
	}
}
