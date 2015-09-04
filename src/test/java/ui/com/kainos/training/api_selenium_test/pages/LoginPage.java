package ui.com.kainos.training.api_selenium_test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	private WebDriver driver;
	
	private static final By USERNAME = By.id("username");
	private static final By PASSWORD = By.id("password");
	private static final By SUBMIT = By.id("submit");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterUsername(String username) {
		WebElement usernameTextBox = driver.findElement(USERNAME);
		usernameTextBox.sendKeys(username);
	}
	
	public void enterPassword(String password) {
		WebElement passwordTextBox = driver.findElement(PASSWORD);
		passwordTextBox.sendKeys(password);
	}
	
	public void clickSubmit() {
		WebElement submitBtn = driver.findElement(SUBMIT);
		submitBtn.click();
	}
	
	public void enterCredentialsAndSubmit(String username, String password) {
		enterUsername(username);
		enterPassword(password);
		clickSubmit();
	}
	
}
