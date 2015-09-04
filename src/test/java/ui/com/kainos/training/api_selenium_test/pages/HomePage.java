package ui.com.kainos.training.api_selenium_test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	private WebDriver driver;
	
	private static final By LOGIN_SUCCESS = By.id("message");
	private static final By FRIEND_NAME_INPUT = By.id("friendNameInput");
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getPageMessage() {
		WebElement message = driver.findElement(LOGIN_SUCCESS);
		return message.getText();
	}
	
	public void enterFriendandSubmit(String friendName) {
		WebElement friendTextBox = driver.findElement(FRIEND_NAME_INPUT);
		friendTextBox.sendKeys(friendName);
	}
}
