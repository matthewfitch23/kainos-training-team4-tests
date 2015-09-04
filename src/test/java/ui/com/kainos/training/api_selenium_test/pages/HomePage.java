package ui.com.kainos.training.api_selenium_test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	private WebDriver driver;
	
	private static final By LOGIN_SUCCESS = By.id("message");
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getPageMessage() {
		WebElement message = driver.findElement(LOGIN_SUCCESS);
		return message.getText();
	}
}
