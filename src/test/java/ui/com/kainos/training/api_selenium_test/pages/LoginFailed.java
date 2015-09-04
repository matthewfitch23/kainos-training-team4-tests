package ui.com.kainos.training.api_selenium_test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginFailed {

	private WebDriver driver;
	
	public static final By FAIL_MESSAGE = By.id("message");
	
	public LoginFailed(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getMessage() {
		WebElement message = driver.findElement(FAIL_MESSAGE);
		return message.getText();
	}
}
